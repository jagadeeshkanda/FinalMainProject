@HomePage
Feature: TechFynder HomePage
	
  Scenario Outline: Opening Home page
      Given User launch the "<currentBrowser>" browser
  		When User enters techFynder URL for specified environment
  		Then Checking the Jobseeker option
  	Examples: 
      | currentBrowser | emailID                                | password |
      | CHROME         | automationtesting1@mail.techfynder.com | Test@123 |
  		
  		
   Scenario Outline: Checking TalentFynder option
      Given User launch the "<currentBrowser>" browser
  		When User enters techFynder URL for specified environment
  		Then Checking the TalentFynder option
  	Examples: 
      | currentBrowser | emailID                                | password |
      | CHROME         | automationtesting1@mail.techfynder.com | Test@123 |
      
   Scenario Outline: Checking TalentFynder option
      Given User launch the "<currentBrowser>" browser
  		When User enters techFynder URL for specified environment
  		Then Checking the TalentFynder option
  	Examples: 
      | currentBrowser | emailID                                | password |
      | CHROME         | automationtesting1@mail.techfynder.com | Test@123 |   