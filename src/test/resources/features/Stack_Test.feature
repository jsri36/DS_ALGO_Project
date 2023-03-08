@DS_ALGO_Stack
Feature: Stack
   
  @TS_007_TC_001
  Scenario: 
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Numpy@sdet100_100" and "Loginsucess@123"
    Then user redirected to homepage
	
	@TS_007_TC_002
  Scenario: The user is directed to "Stack" Page
    Given The user is in "home page" after logged in
    When The user select stack item from the drop down menu
    Then The user should be directed to "Stack" Page

	@TS_007_TC_003
  Scenario: The user is able to navigate to "Operations in Stack" page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Operations in Stack link
    Then The user should then be directed to "Operations in Stack" Page

  @TS_007_TC_004
  Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the Operations in Stack page after logged in
    When The user clicks "Try Here" button in "stack" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_007_TC_005
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in the Stack page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in stack tryEditor
    Then The user should be presented with Run output
	  
	  Examples: 
						| Sheetname	 |RowNumber| 
						| pythonCode |       0 |

	@TS_007_TC_006
  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in the Stack page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
    And The user clicks on Run button after Entering invalid python code in stack tryEditor
    Then The user should get the error message

		Examples: 
						| Sheetname  | RowNumber | 
						| pythonCode |         1 |

	@TS_007_TC_007
  Scenario: The user is able to navigate to "Implementation" Page  
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Implementation button
    Then The user should then be directed to Implementation Page
  
  @TS_007_TC_008
  Scenario: The user is able to navigate to Implementation page having an tryeditor
    Given The user is on "Stack Implementation page" after logged in
    When The user clicks "Try Here" button in "stack Implementation" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_007_TC_009
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in the Stack page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in stack tryEditor
    Then The user should be presented with Run output
	
	Examples: 
					|Sheetname	 |RowNumber	 | 
					| pythonCode |         0 |
    
  @TS_007_TC_010
  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in the Stack page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
    And The user clicks on Run button after Entering invalid python code in stack tryEditor
    Then The user should get the error message

		Examples: 
						| Sheetname  | RowNumber | 
						| pythonCode |         1 |

	@TS_007_TC_011
  Scenario: The user is able to navigate to "Applications" in stack Page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Applications button
    Then The user should be directed to Applications Page
    
  @TS_007_TC_012
  Scenario: The user is able to navigate to Applications page having an tryEditor
    Given The user is on the Applications stack page after logged in
    When The user clicks "Try Here" button in "stack Applications" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
		
	@TS_007_TC_013
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in the Stack page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button after Entering valid python code in stack tryEditor
    Then The user should be presented with Run output

	Examples: 
					|Sheetname	 |RowNumber	 | 
					| pythonCode |         0 |

 @TS_007_TC_014
  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in the Stack page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> 
    And The user clicks on Run button after Entering invalid python code in stack tryEditor
    Then The user should get the error message

		Examples: 
						| Sheetname  | RowNumber | 
						| pythonCode |         1 |

	@TS_007_TC_015
  Scenario: The user is able to navigate to "Practice Questions" in stack Page
    Given The user is on the "stack page" after logged in
    When The user clicks on the Practice Questions button
    Then The user should be directed to Practice Questions Page
