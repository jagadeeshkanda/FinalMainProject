package HopePage.steps;

import org.testng.Assert;

import JobSeekerRegistration.Registration;
import WebPages.Home;
import browsers.AbstractTestNGFramework;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.BaseTest;

public class JobSeekerRegistration extends BaseTest {
	AbstractTestNGFramework abstractTestNGFramework = new AbstractTestNGFramework();
	Registration home ;
	 @Given("the user clicks on JobFynder")
	    public void the_user_clicks_on_jobfynder() {
		 home =new Registration(getDriver());
		 home.ClickJobFynder();
	    }
	
	    @Then("the for JobSeeker option should be visible")
	    public void the_jobseeker_option_should_be_visible() {
			 home =new Registration(getDriver());

	        Assert.assertTrue(home.isForJobseeker(), "JobSeeker option is not visible");
	    }
	
	    @And("the user clicks on JobSeeker")
	    public void the_user_clicks_on_jobseeker() {
			 home =new Registration(getDriver());
			 home.ClickForJobseeker();
	    }
	
	    @Then("the Register option should be visible")
	    public void the_register_option_should_be_visible() {
			 home =new Registration(getDriver());
	        Assert.assertTrue(home.isRegister(), "Register option is not visible");
	    }
	
	    @And("the user clicks on Register")
	    public void the_user_clicks_on_register() {
			 home =new Registration(getDriver());

			 home.ClickRegister();
	    }
	    
	    @Then("Enter the first Key")
	    public void sendvalueFirstName() {
	    	 home =new Registration(getDriver());

			 home.sendvalueFirstName();
		}
}

