package stepdefinition;

import com.cucumber.contexts.TestContext;
import com.cucumber.pageObjects.SearchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps {

	private TestContext testContext;
	private SearchPage searchPage;
	private String txt = "Cucumber";

	public SearchSteps(TestContext context) {
		this.testContext = context;
		searchPage = testContext.getPageObjectManager().getSearchPage();
	}

	@When("^open baidu page$")
	public void open_baidu_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// driver.get(HOST);
		searchPage.openBrowser();
	}

	@When("^input txt and click btn$")
	public void input_txt_and_click_btn() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		searchPage.inputTxtAndClickBtn(txt);
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		testContext.getWebDriverManager().closeDriver();
	}

}