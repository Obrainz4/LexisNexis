package co.uk.LexisNexis.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/LexisNexis/features"},
        glue = {"co/uk/LexisNexis/hooks","co/uk/LexisNexis/stepDefinitions"},
        tags = "not @exclude",
        plugin = {"pretty", "html:target/cucumber-report"},
        publish = true

)

public class TestRunner {
}
