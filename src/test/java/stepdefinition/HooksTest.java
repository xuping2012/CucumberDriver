package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.contexts.TestContext;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksTest {

	TestContext testContext;

	public HooksTest(TestContext context) {
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
		Reporter.assignAuthor("ToolsQA - Lakshay Sharma");
	}

	@After(order = 1)
	public void AfterSteps(Scenario scenario) {
		System.out.println("所有测试执行完，我都会执行");
		// testContext.getWebDriverManager().closeDriver();
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				// This takes a screenshot from the driver at save it to the
				// specified location
				File sourcePath = ((TakesScreenshot) testContext
						.getWebDriverManager().getDriver())
						.getScreenshotAs(OutputType.FILE);

				// Building up the destination path for the screenshot to save
				// Also make sure to create a folder 'screenshots' with in the
				// cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir")
						+ "/target/cucumber-reports/screenshots/"
						+ screenshotName + ".png");

				// Copy taken screenshot from source location to destination
				// location
				Files.copy(sourcePath, destinationPath);

				// This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			}
		}

	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}
