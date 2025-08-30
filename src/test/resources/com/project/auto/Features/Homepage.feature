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
  		
  	
     Scenario Outline: Checking IntershipFynder option
      Given User launch the "<currentBrowser>" browser
  		When User enters techFynder URL for specified environment
  		Then Checking the IntershipFynder option
  	Examples: 
      | currentBrowser | emailID                                | password |
      | CHROME         | automationtesting1@mail.techfynder.com | Test@123 |
  		
  		 Scenario Outline: Checking StudyFynder option
      Given User launch the "<currentBrowser>" browser
  		When User enters techFynder URL for specified environment
  		Then Checking the StudyFynder option
  	Examples: 
      | currentBrowser | emailID                                | password |
      | CHROME         | automationtesting1@mail.techfynder.com | Test@123 |
  		
  		 Scenario Outline: Checking SkillFynder option
      Given User launch the "<currentBrowser>" browser
  		When User enters techFynder URL for specified environment
  		Then Checking the SkillFynder option
  	Examples: 
      | currentBrowser | emailID                                | password |
      | CHROME         | automationtesting1@mail.techfynder.com | Test@123 |
      
      
      @Homepageone
       Scenario Outline: Checking SkillFynder option
      Given User launch the "<currentBrowser>" browser
      When User enters techFynder URL for specified environment
      Then Checking the Jobseeker option
      Given the user clicks on JobFynder
      Then the for JobSeeker option should be visible
      And the user clicks on JobSeeker
      Then the Register option should be visible
      And the user clicks on Register
      Then Enter the first Key
      Then Enter the Last Key
      Then Enter the Last Key
      
      
      
        	Examples: 
      | currentBrowser | emailID                                | password |
      | chrome         | automationtesting1@mail.techfynder.com | Test@123 |
      
  		