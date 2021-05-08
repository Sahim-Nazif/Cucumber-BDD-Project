package testrunners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/bdd/cumcuber/project/features/MovieManagement.feature",
       
         glue={"stepdefinitions"}
)

public class Runner {

}
