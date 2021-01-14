package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinitions" },
monochrome = true ,  //Black and White 
//plugin = {"pretty", "html:target/HtmlReports"}
//plugin = {"pretty", "json:target/JSONReports/report.json"}
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports"},
tags="@smoketest"
		)
public class TestRunner {

}