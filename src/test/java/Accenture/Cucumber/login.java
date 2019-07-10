package Accenture.Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {
    String str,a;
	  @Given("^when the user prints hello World$")
	  public void preCondition() throws Throwable {
	      str = "Hello World$";
	  }
	  @Then("^Hello world displays in console$")
	  public void print() throws Throwable {
	      System.out.println(str);
	  }  

	  @Given("^when the user print his name$")
	  public void postCondition() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	      a= "His name is Mano";
	  }

	  @Then("^name is printed in console$")
	  public void prints() throws Throwable {
	      // Write code here that turns the phrase above into concrete actions
	   System.out.println(a);
	  }


}

