package stepdefinition;

import com.cucumber.managers.FileReaderManager;
import com.cucumber.testDataType.Customer;
import com.cucumber.testDataType.TestJsonData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataProvider {

	TestJsonData testJsonData;

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^enter \"([^\"]*)\" personal details on checkout page$")
	public void enter_personal_details_on_checkout_page(String arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Customer customer = FileReaderManager.getInstance().getJsonReader()
				.getCustomerByName(arg1);
		testJsonData.fill_PersonalDetails(customer);
		
	}

	@When("^select same delivery address$")
	public void select_same_delivery_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^select payment method as \"([^\"]*)\" payment$")
	public void select_payment_method_as_payment(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@When("^place the order$")
	public void place_the_order() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
