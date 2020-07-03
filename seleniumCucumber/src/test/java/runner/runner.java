package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/Destination", "junit:target/cucumber-reports/Cucumber.xml" } , features="src/test/resources/sample.feature", glue={"stepDefinition"})
public class runner {

}