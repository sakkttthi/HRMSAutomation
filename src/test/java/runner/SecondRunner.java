package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@target/Firstfailedrerun.txt"}, 
		glue = "stepdefinitions",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,
        		"rerun:target/Secondfailedrerun.txt"}
		)

public class SecondRunner {

}
