package stepdefinition;

import com.cucumber.contexts.TestContext;
import com.cucumber.pageObjects.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BaiduSearch {

	TestContext testContext;
	SearchPage searchPage;

	public BaiduSearch(TestContext context) {
		this.testContext = context;
		searchPage = testContext.getPageObjectManager().getSearchPage();
	}

	@Given("^open the browser again$")
	public void open_the_browser_agin() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		searchPage.openBrowser();
	}

	@When("^input \"([^\"]*)\" and click btn$")
	public void input_and_click_btn(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		searchPage.inputTxtAndClickBtn(arg1);
	}

	@Then("^close browser again$")
	public void close_browser_agin() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		testContext.getWebDriverManager().closeDriver();
	}

}
