package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("Inside Step - user is on login page");
		}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		System.out.println("Inside Step - user enters username and password");
	}

	@And("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		System.out.println("Inside Step - click on login button");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		System.out.println("Inside Step - user is navigated tp the home page");
	}
}
