package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/", glue={"gluecode"}, plugin= {"pretty", "html:target/WebAutomationReport.html"},publish=true,monochrome=true,dryRun=true)


public class TestRunner {
	



}
