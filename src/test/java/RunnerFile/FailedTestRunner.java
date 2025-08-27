package RunnerFile;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "@target/failed_scenarios.txt",   // 👈 Note the @
	    glue = { "HopePage.steps","utilities" },
	    plugin = { 
	        "pretty", 
	        "html:target/cucumber-reports/rerun-cucumber.html",
	        "json:target/cucumber-reports/RerunTestReport.json"
	    },
	    monochrome = true
	)
	public class FailedTestRunner extends AbstractTestNGCucumberTests {
	    @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	}
