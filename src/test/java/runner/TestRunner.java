package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
        glue = {"stepdefinition"},
plugin ={ "pretty", "html:target\\cucumber\\report.html"},
tags = ("@SceanrioComplet")
)

public class TestRunner {


}
