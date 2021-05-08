package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MovieManagementSteps {
	
	Movie newMovie;
	
	@Given("^I have a movie with name \"([^\"]*)\" genre \"([^\"]*)\" and price (\\d+)$")
	public void movieNamePrice(String movieName, String genre, int price)  {
	   
	   newMovie= new Movie(movieName, genre, price);
	   System.out.println("Step1");
	   
	}

	@When("^I add that movie$")
	public void addMovie()  {
	   
		newMovie.setMovieName("The Marksman");
		System.out.println("Step2");
	}

	@Then("^Movie with name \"([^\"]*)\" should be added$")
	public void validate(String movieName)  {
		
		System.out.println(newMovie.getMovieName());
		
		System.out.println("Step3");
	   
	}


}
