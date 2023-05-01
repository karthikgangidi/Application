package Testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src//test//Features"},glue = {"Stepdefinitions","AppHooks"},
        plugin = {"pretty","html:target/cucumber-reports/my-report.html"},monochrome = true
)

public class Testrunner1 {
}
