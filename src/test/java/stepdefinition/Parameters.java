package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameters {

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("我没有内容");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("我没有内容");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("参数化，帐号："+arg1+"密码："+arg2);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("我没有内容");
	}
}
