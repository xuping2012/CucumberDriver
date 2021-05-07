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

	// 做一个测试上下文;每次启动都会打开一次浏览器
	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		// 场景日志
		Reporter.addScenarioLog("场景之前执行" + scenario.getName());
		// 根据场景来划分feature场景是谁写的
		if (scenario.getName().contains("Login")) {
			Reporter.assignAuthor("是xxx写的");
		} else if (scenario.getName().contains("Credentials")) {
			Reporter.assignAuthor("是yyy写的");
		}
	}

	@Before
	public void BeforeSteps() {
		/*
		 * What all you can perform here Starting a webdriver Setting up DB
		 * connections Setting up test data Setting up browser cookies
		 * Navigating to certain page or anything before the test
		 */
	}

	@After(order = 1)
	public void AfterSteps(Scenario scenario) {
		// testContext.getWebDriverManager().closeDriver();
		if (scenario.isFailed()) {
			Reporter.addStepLog("步骤：" + scenario.getName() + "执行错误!!!");
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
		} else {
			// 步骤日志
			Reporter.addStepLog("步骤：" + scenario.getId() + scenario.getName()
					+ "执行成功!!!");
		}

	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}
}