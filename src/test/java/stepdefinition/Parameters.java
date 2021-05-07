package stepdefinition;

import org.testng.Assert;

import com.cucumber.contexts.TestContext;
import com.cucumber.pageObjects.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameters {

	private TestContext testContext;
	private SearchPage searchPage;

	public Parameters(TestContext context) {
		this.testContext = context;
		searchPage = testContext.getPageObjectManager().getSearchPage();
	}

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("我没有内容");
		searchPage.openBrowser();

	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("我没有内容");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("参数化，帐号：" + arg1 + "密码：" + arg2);
		searchPage.inputTxtAndClickBtn(arg2);
		Assert.assertEquals(arg2, arg1);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("后面会自动关闭浏览器");
	}
}
