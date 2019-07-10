package Accenture.Cucumber;

import org.testng.annotations.Test;

import cucumber.api.java.en.When;

public class FrontEnd {
	@When("^login using user(\\d+) and user(\\d+)$")
	public void login_using_user_and_user(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
       System.out.println("Users have logged in using below credentials");
       System.out.println(arg1+" ="+arg2);
	}


}
