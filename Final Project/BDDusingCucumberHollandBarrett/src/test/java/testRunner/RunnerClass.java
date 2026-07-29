package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "stepDefinition",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)

public class RunnerClass {

}