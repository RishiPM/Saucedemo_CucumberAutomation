package saucedemo.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="Features",
		glue="saucedemo.stepDefinition",
		dryRun=false,
		monochrome=true,
		format= {"pretty","html:test-output","json:json_output/cucumber.json"}
		)
public class Login_TestRunner {

}
