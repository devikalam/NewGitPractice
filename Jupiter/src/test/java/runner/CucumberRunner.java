package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"./src/test/java/featurefiles"},glue = {"stepDefinitions","hook"},
/*tags = "@Search",*/
dryRun=true,
plugin = {"html:Reports/CucumberReports.html","json:Reports/CucumberJSonReports.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
