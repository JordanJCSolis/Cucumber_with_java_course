package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() {
		System.out.println("User is on landing page");
	}

	@When("^user login into application with username and password$")
	public void user_login_into_application() {
		System.out.println("user login into application with username and password");
	}

	@Then("^homepage should be displayed$")
	public void homepage_should_be_displayed() {
		System.out.println("Homepage should be displayed");
	}

	@And("^user accounts should be displayed$")
	public void user_accounts_shpuld_be_displayed() {
		System.out.println("user accounts should be displayed");
	}

	@When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application(String username, String password) throws Throwable {
		System.out.println("Using parameterizing");
		System.out.println("User: " + username);
		System.out.println("Password: " + password);
	}

	@When("^user sign up with following details$")
	public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
		System.out.println("Datatable row 0:" + obj.get(1).get(0));
		System.out.println("Datatable row 1:" + obj.get(1).get(1));
		System.out.println("Datatable row 2:" + obj.get(1).get(2));
		System.out.println("Datatable row 3:" + obj.get(1).get(3));
		System.out.println("Datatable row 4:" + obj.get(1).get(4));
	}

	@When("^user login into application with (.+) and (.+)$")
	public void user_login_into_application_using_datadriven(String username, String password) throws Throwable {
		System.out.println("Using parameterizing");
		System.out.println("User: " + username);
		System.out.println("Password: " + password);
	}

}
