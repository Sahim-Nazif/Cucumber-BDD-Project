package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MovieRentalSteps {
	
	@Given("^I have a movie with name \"([^\"]*)\" and price (\\d+)$")
	public void i_have_a_movie_with_name_and_price(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I add that movie$")
	public void i_add_that_movie() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^Movie with name \"([^\"]*)\" should be added$")
	public void movie_with_name_should_be_added(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}


}
