@DS_ALGO_Register_Page
Feature: Register Page
 
  @TS_002_TC_001
  Scenario: User launch home page of dsalgo project
    Given The user opens "DS Algo portal" link
    When The user clicks the Get Started button
    Then The user should be redirected to home page
 
  @TS_002_TC_002
  Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field." below Username textbox

	@TS_002_TC_003
  Scenario: The user is presented with error message for empty fields below Password textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering username with other fields empty  
      #Data Table -- test data is Explicitly meant for specific steps
      | username     |
      | Numpy@sdet84_1 | 
    Then It should display an error "Please fill out this field." below Password textbox

 	@TS_002_TC_004
  Scenario: The user is presented with error message for empty fields below Password Confirmation textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering "username" and "password" with Password Confirmation field empty
      | username     | password     |
      | Numpy@sdet84_1 | testpassword |
    Then It should display an error "Please fill out this field." below Password Confirmation textbox
 
  @TS_002_TC_005 
  Scenario: The user is presented with error message for invalid username
    Given The user opens Register Page
    When The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
      | username | password     | password confirmation |
      | &**&**&  | testpassword | testpassword          |
    Then It should display an error message "Please enter a valid username"
    
  @TS_002_TC_006
  Scenario: The user is presented with error message for username already exists
    Given The user opens Register Page
    When The user enters a valid existing "username" with "password" and "password confirmation"
      | username     | password  | password confirmation |
      | Numpy@sdet84_1 | RT56YUabc | RT56YUabc  |
    Then It should display an error message "Username already exists"
    
  @TS_002_TC_007
  Scenario: The user is presented with error message for password mismatch
    Given The user opens Register Page
    When The user clicks "Register" button after entering valid "username" and different passwords in "password" and "password confirmation" fields
      | username     | password     | password confirmation |
      | Numpy@sdet84_1 | testpassword | testpassword1   | 
    Then It should display an error message "password_mismatch:The two password fields didn’t match."

	@TS_002_TC_008 
  Scenario: The user is presented with error message for password with characters less than 8
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with characters less than 8
      | username     | password | password confirmation |
      | Numpy@sdet84_1 | a1b2c3d  | a1b2c3d            |
    Then It should display an error message "Password should contain at least 8 characters"
    
  @TS_002_TC_009 
  Scenario: The user is presented with error message for password with only numbers
    Given The user opens Register Page
    When The user enters a valid "username" and "password" with only numbers
      | username     | password | password confirmation |
      | Numpy@sdet84_1 | 12345678 |            12345678 |
    Then It should display an error message "Password can’t be entirely numeric."
    
  @TS_002_TC_010
  Scenario: The user is presented with error message for password too similar to your other personal information
    Given The user opens Register Page
    When The user enters a valid "username" and "password" similar to username
      | username     | password   | password confirmation |
      | Numpy@sdet84_1 | testsdet84 | testsdet84          |
    Then It should display an error message "password can’t be too similar to your other personal information."
    
  @TS_002_TC_0011
  Scenario: The user is presented with error message for commonly used password
    Given The user opens Register Page
    When The user enters a valid "username" and commonly used password "password"
      | username     | password | password confirmation |
      | Numpy@sdet84_1 | Welcome1 | Welcome1          |
    Then It should display an error message "Password can’t be commonly used password"
	# Test will Fail bcaz username already exist
  @TS_002_TC_0012
  Scenario: The user is succesfully able to register
    Given The user opens Register Page
    When The user enters a valid "username" and "password" and "password confirmation"
      | username     | password  | password confirmation |
      | Numpy@sdet100_100 | Loginsucess@123 | Loginsucess@123      |
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as "<username>""

	@TS_002_TC_0013
  Scenario Outline: The user is able to signin with registered credential
    Given The user is in the Sign in page
    When The user enters a valid "<username>" and "<password>"
    Then "click login button to verify"
		Examples: 
      | username   | password  |
      | Numpy@sdet100_100 | Loginsucess@123 |
 
    
    
    