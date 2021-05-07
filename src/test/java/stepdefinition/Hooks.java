package stepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.cucumber.contexts.TestContext;
import com.cucumber.extentreporter.Screenshots;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * 
 * TODO:Cucumber框架的hooks只支持After、Before;且是方法级别； 所以针对方法需要做环境前后处理，再此处完成；
 * 但是在runner启动器是类级别的，及一个用例类执行前后的操作。
 *
 * @author Joe-Tester
 * @time 2021年5月7日
 * @file Hooks.java
 */
public class Hooks {

	TestContext testContext;
	ExtentTest test;

	// 做一个测试上下文
	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void beforeScenario(Scenario scenario) {

	}

	@Before
	public void BeforeSteps() {
		/*
		 * What all you can perform here Starting a webdriver Setting up DB
		 * connections Setting up test data Setting up browser cookies
		 * Navigating to certain page or anything before the test
		 */
		System.out.println("我是执行在所有步骤之前");
	}

	@After(order = 1)
	public void AfterSteps(Scenario scenario) {
		System.out.println("所有测试执行完，我都会执行");
		// testContext.getWebDriverManager().closeDriver();
		if (scenario.isFailed()) {

			// 场景获取场景描述
			String screenshotName = scenario.getName().replaceAll(" ", "_");

			try {

				// 这个是加入到feature报告中的操作
				// Take a screenshot...
				final byte[] screenshot = Screenshots
						.takeScreenshot(testContext.getWebDriverManager()
								.getDriver());
				// ... and embed it in the report.
				scenario.embed(screenshot, "image/png");

				// 封装的截图方法，然后添加的报告中去
				// This takes a screenshot from the driver at save it to the
				// specified location
				// 如果不封装，可以将代码移至此处
				String destinationPath = Screenshots.takeScreenshot(testContext
						.getWebDriverManager().getDriver(), screenshotName);
				Reporter.addScreenCaptureFromPath(destinationPath);
			} catch (IOException e) {
				System.out.println("异常不处理!");
			}
		}
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}
}