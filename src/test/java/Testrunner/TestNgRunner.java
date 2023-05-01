
package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src//test//Features"},glue = {"Stepdefinitions","AppHooks"},
        plugin = {"pretty","html:target/cucumber-reports/my-report.html"},monochrome = true
)

public class TestNgRunner extends AbstractTestNGCucumberTests {
}

