package RunnerFile;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/com/project/auto/Features", 
glue = { "HopePage.steps","utilities"}, 
tags = "@HomePageOne or @HomePage",
plugin = { "pretty", 
		 "html:target/cucumber-reports/cucumber-pretty.html", 
		 "json:target/cucumber-reports/CucumberTestReport.json",
		 "rerun:target/cucumber-reports/failed_scenarios.txt",
		 "timeline:target/cucumber-reports"},
monochrome = true, 
dryRun = false)

public class TestRunnerfile extends AbstractTestNGCucumberTests{
@Override
@DataProvider (parallel = false)
public Object[][] scenarios() {
return super.scenarios();
}
}
