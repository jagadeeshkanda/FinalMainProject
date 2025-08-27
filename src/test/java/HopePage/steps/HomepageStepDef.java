package HopePage.steps;



import WebPages.Home;
import browsers.AbstractTestNGFramework;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseTest;
import org.testng.Assert;


public class HomepageStepDef extends BaseTest{
	
	AbstractTestNGFramework abstractTestNGFramework = new AbstractTestNGFramework();
	Home home ;

	@Given("^User launch the \"(.*)\" browser$")
	public void launchBrowser(String browserName) {
		// abstractTestNGFramework.setUp(browserName);
		setDriver(abstractTestNGFramework.initBrowser(browserName));
	}
	
	@When("^User enters techFynder URL for specified environment$")
	public void openURL() throws InterruptedException {
		abstractTestNGFramework.openTestURL();
	}
	
	@Then("^Checking the Jobseeker option")
	public void is_JobSeeker_Displayed() {
		home =new Home(getDriver());
	    Assert.assertTrue( home.isJobSeekerDisplayed(),"JobSeeker tab is not displayed!");
	}

	@Then("^Checking the TalentFynder option")
	public void is_TalentFynder_Displayed() {
		home =new Home(getDriver());
	    Assert.assertTrue( home.isTalentFynderDisplayed(),"TalentFynder tab is not displayed!");
	}
	
	@Then("^Checking the IntershipFynder option")
	public void is_IntershipFynder_Displayed() {
		home =new Home(getDriver());
	    Assert.assertTrue( home.isInternShipFynderDisplayed(),"InternShipFynder tab is not displayed!");
	}
	
	@Then("^Checking the StudyFynder option")
	public void is_StudyFynder_Displayed() {
		home =new Home(getDriver());
	    Assert.assertTrue( home.isStudyFynderDisplayed(),"StudyFynder tab is not displayed!");
	}
	
	@Then("^Checking the SkillFynder option")
	public void is_SkillFynder_Displayed() {
		home =new Home(getDriver());
	    Assert.assertTrue( home.isSkillFynderDisplayed(),"StudyFynder tab is not displayed!");
	}
}
