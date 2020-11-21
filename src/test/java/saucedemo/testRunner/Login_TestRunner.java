package saucedemo.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="Features",
		glue="saucedemo.stepDefinition"
		)
public class Login_TestRunner {

}
