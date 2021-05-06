package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	@Given("^I am in the HR system with \"([^\"]*)\" account$")
	public void i_am_in_the_HR_system_with_account(String arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@Given("^there is another user with \"([^\"]*)\" password$")
	public void there_is_another_user_with_password(String arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@When("^I update password of the user to \"([^\"]*)\"$")
	public void i_update_password_of_the_user_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@Then("^I got the message \"([^\"]*)\"$")
	public void i_got_the_message(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@Then("^the user password should be \"([^\"]*)\"$")
	public void the_user_password_should_be(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}
}
