@DS_ALGO_SignIn_Page
Feature: SignIn_Page
   
  @TS_003_TC_001
  Scenario: Verifying Register link
    Given The user is on signin page
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page

  @TS_003_TC_002
  Scenario Outline: User on login page and login with invalid inputs
    Given The user is on signin page
    When  The user enter invalid "<username>" and "<password>"
    Then click login button to verify
 		Examples: 
      | username | password |
      | user     |          |
      |          | passowrd |
      |          |          |
  @TS_003_TC_003
  Scenario Outline: "User on login page and login with invalid and valid inputs from Excel"
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button
	Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
	
	@TS_003_TC_004
  Scenario:  Verifying signout link
    Given The user is in the Home page with valid log in
    When The user clicks on "Sign out" 
    Then The user redirected to homepage


    