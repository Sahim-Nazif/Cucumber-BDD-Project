package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MovieRentalSteps {
	
	@Given("I have a movie with name {string} and price {int}")
	public void movieName_Price(String movieName, int price)  {
	   
	    
	}

	@When("I add that movie$")
	public void addMovie()  {
	  
	}

	@Then("Movie with name \"([^\"]*)\" should be added$")
	public void validate(String arg1)  {
	 
	
	}


}
