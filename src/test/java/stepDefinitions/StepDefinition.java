package stepDefinitions;

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

	@When("^user login into application with (.+) and (.+)$")
	public void user_login_into_application(String username, String password) throws Throwable {
		System.out.println("Using parameterizing");
		System.out.println("User: " + username);
		System.out.println("Password: " + password);
	}
}
