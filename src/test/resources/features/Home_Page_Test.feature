@DS_ALGO_Home_Page
Feature: Home Page
  As a new user I want to use this website
	@Invalid
  @TS_001_TC_001
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
@valid
	@TS_001_TC_002
	Scenario Outline: User is on Home page and click getstarted link on home page without sign in
		Given The user is on Home page
		When The user clicks on Get Started link on homepage "<option>" without login
		Then The user get warning message "You are not logged in"	
 #Example Table -- where ENTIRE scenario needs to be tested with different/multiple test data.
			Examples:
      | option         |  
      | Data Structures |
      | Array         |
      | Linked List     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
  
  @TS_001_TC_003
	Scenario Outline: User is on Home page and click on dropdown without sign in
		Given The user is on Home page
		When  The user clicks on dropdown "<option>" without login
		Then The user get warning message "You are not logged in"

    Examples: 
      | option         |
      | Array         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
   
  @TS_001_TC_004
  Scenario: User is on Home page and click on sign in
    Given The user opens Home Page
    When The user clicks "Sign in"
    Then The user should be redirected to Sign in page

  @TS_001_TC_005
  Scenario:  User is on Home page and click on Register
    Given The user opens Home Page
    When The user clicks "Register"
    Then The user should be redirected to Register form
    
   