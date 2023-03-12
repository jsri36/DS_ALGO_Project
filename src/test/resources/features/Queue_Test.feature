@DS_ALGO_Queue
Feature: Queue
   
  @TS_008_TC_001
  Scenario: The user is directed to "Home" Page
    Given The user is on the Signin page of DS Algo portal
		When The user enters valid "Numpy@sdet100_100" and "Loginsucess@123" 
		And The user click on login button
    Then User redirected to homepage

  @TS_008_TC_002
  Scenario: The user is able to navigate to Queue Data Structure Page
    Given The user is in the Home page  
    When The user clicks the Queue item from drop down menu
    Then The user should be directed to Queue Data Structure Page
    
  @TS_008_TC_003
  Scenario: The user is able to navigate to Implementation of Queue in Python link page
    Given The user is in Queue Page
    When The user clicks on Implementation of queue in Python link
    Then The user should be directed to Implementation of queue in Python Page
    
  @TS_008_TC_004
  Scenario: The user should be directed to editor page with run button to test python code
    Given The user is in Implementation of queue in Python Page
    When The user clicks on Try here link
    Then The user navigates to Editor page with Run button

  @TS_008_TC_005
  Scenario Outline: The user is able to run code in Editor for Implementation of queue page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber> 
    And clicks Run Button
    Then The user is presented with the result after Run Button is clicked
	  
	Examples: 
					|Sheetname	 |RowNumber		| 
					| pythonCode |         0  |

	@TS_008_TC_006
  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user gets an Error Message

		Examples: 
						| Sheetname  | RowNumber | 
						| pythonCode |         1 |
	
	@TS_008_TC_007
  Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link
    Given The user is in Queue Page
    When The user clicks on Implementation using collections deque link
    Then The user should be redirected to Implementation using collections deque page
   
	@TS_008_TC_008
  Scenario: The user should be directed to editor page with run button to test python code from Implementation using collections page
    Given The user in implementation using collections page 
    When The user clicks on Try here link
    Then The user navigates to Editor page with Run button
    
  @TS_008_TC_009
  Scenario Outline: The user is able to run code in Editor for Implementation using collections page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user is presented with the result after Run Button is clicked

		Examples: 
						|Sheetname	 |RowNumber	 | 
						| pythonCode |         0 |

	@TS_008_TC_010
  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation using collections page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user gets an Error Message

		Examples: 
						| Sheetname  | RowNumber | 
						| pythonCode |         1 |

	@TS_008_TC_011
  Scenario: The user is able to navigate to queue page and click on Implementation using array link
  	Given The user is in Queue Page
    When The user clicks on Implementation using array link
    Then The user should be redirected to Implementation using array page
  
	@TS_008_TC_012
  Scenario: The user should be directed to editor page with run button to test python code from Implementation using array page
   	Given The user in Implementation using array page  
    When The user clicks on Try here link
    Then The user navigates to Editor page with Run button
    
  @TS_008_TC_013
  Scenario Outline: The user is able to run code in Editor for Implementation using array page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user is presented with the result after Run Button is clicked

		Examples: 
						|Sheetname	 |RowNumber	 | 
						| pythonCode |         0 |
						
	@TS_008_TC_014
  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation using array page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user gets an Error Message

		Examples: 
						| Sheetname  | RowNumber | 
						| pythonCode |         1 |
						
	@TS_008_TC_015
  Scenario: The user is able to navigate to queue page and click on Queue Operations link
    Given The user is in Queue Page
    When The user clicks on Queue Operations link
    Then The user should be redirected to Queue Operations page

	@TS_008_TC_016
  Scenario: The user should be directed to editor page with run button to test python code
    Given The user in Queue Operations page
    When The user clicks on Try here link
    Then The user navigates to Editor page with Run button
    
  @TS_008_TC_017
  Scenario Outline: The user is able to run code in Editor for Queue Operations page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user is presented with the result after Run Button is clicked

		Examples: 
						|Sheetname	 |RowNumber	 | 
						| pythonCode |         0 |
						
	@TS_008_TC_018
  Scenario Outline: The user is presented with error message for invalid code in Editor
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user gets an Error Message

		Examples: 
						| Sheetname  | RowNumber | 
						| pythonCode |         1 |
    
  @TS_007_TC_019
  Scenario: The user is able to navigate to QueueOp page and click on Practice Questions
    Given The user is in Editor page and navigates to QueueOp page
    When The user clicks on Practice Questions
    Then The user is directed to Practice page