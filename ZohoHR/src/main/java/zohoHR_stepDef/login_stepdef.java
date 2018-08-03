package zohoHR_stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import zohoHR_TestBase.Testbase;

public class login_stepdef extends Testbase {
	
	@Given("^the user is on the login page$")
	public void the_user_is_on_the_login_page() throws Throwable {
		initialization();
	}

	@When("^he enters kundanaharshita@gmail\\.com and harkun(\\d+)$")
	public void he_enters_kundanaharshita_gmail_com_and_harkun(int arg1) throws Throwable {
	    
	}

	@When("^clicks login button$")
	public void clicks_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^he should be on the homepage$")
	public void he_should_be_on_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
