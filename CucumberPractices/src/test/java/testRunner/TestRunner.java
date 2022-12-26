package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/AppFeature"},
		glue = {"stepdefinitions"},
		plugin = { "json:target/cucumber.json" },
		monochrome = true
		)
public class TestRunner {

}
