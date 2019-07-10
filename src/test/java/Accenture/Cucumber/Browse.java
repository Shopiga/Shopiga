package Accenture.Cucumber;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Browse {
  
	@Given("^Browser must be present in the system$")
	public void browser_must_be_present_in_the_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Browser Launch");
	}

	@When("^user opens the application in the browser$")
	public void user_opens_the_application_in_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Browser Launch2");
	}

	@Then("^Testme opens in the browser$")
	public void testme_opens_in_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Browser Launch3");
	}

	@Given("^User must be already registered$")
	public void user_must_be_already_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Registration 1");
	}

	@When("^user enters the correct credentials$")
	public void user_enters_the_correct_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Registration 2");
	}

	@Then("^user must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Registration 3");
	}

	@Given("^User must have search option$")
	public void user_must_have_search_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Search 1");
	}

	@When("^search for the product with name$")
	public void search_for_the_product_with_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Search 2");
	}

	@Then("^searched product detail must be displayed in page$")
	public void searched_product_detail_must_be_displayed_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Search 3");
	}


}
