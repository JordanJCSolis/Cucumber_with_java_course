package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions",
			tags = "@E2E",
			plugin = {"html:target/reports/cucumber_html_report.html",
					"json:target/reports/cucumber_json_report.json",
					"junit:target/reports/cucumber_junit_report.xml",
					"pretty"},
			dryRun = true,
			monochrome = true)

public class TestRunner {

}
