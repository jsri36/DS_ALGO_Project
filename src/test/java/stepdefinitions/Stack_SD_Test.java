package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProviders.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Stack_POM_Test;
import utilities.LoggerLoad;

public class Stack_SD_Test {
	
	Stack_POM_Test stack =null;
	WebDriver driver =null;
	{
		driver = DriverManager.getDriver();
		stack = new Stack_POM_Test(driver);
	}	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		LoggerLoad.info("User is on Signin page to test Stack");
	    stack.openPage();
	}
	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String username, String password) {
		LoggerLoad.info("Entering username & password");
	    stack.validUsernamePassword(username, password);
	}
	@Then("user redirected to homepage")
	public void user_redirected_to_homepage() {
		LoggerLoad.info("Stack - Clicks login button");
		stack.clickSignin();
		Assert.assertTrue(stack.compareTitle().contentEquals("NumpyNinja"));
	}
	@Given("The user is in {string} after logged in")
	public void the_user_is_in_after_logged_in(String string) {
		LoggerLoad.info("User is in Home Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("NumpyNinja"));
	}
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String title) {
		LoggerLoad.info("User is on the Stack Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Stack"));
	}
	@When("The user select stack item from the drop down menu")
	public void the_user_select_stack_item_from_the_drop_down_menu() {
		LoggerLoad.info("Selecting Stack from drop down");
	   stack.selectDropdown();
	}
	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
		LoggerLoad.info("Directed to Stack Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Stack"));
	}
	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
		LoggerLoad.info("Clicking Operations Stack Link");
		stack.clickOperationsStackLink();
	}	
	@Then("The user should then be directed to {string} Page")
	public void the_user_should_then_be_directed_to_page(String string) {
		LoggerLoad.info("Directed Operations in Stack Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Operations in Stack"));
	}
	@Given("The user is on the Operations in Stack page after logged in")
	public void the_user_is_on_the_operations_in_stack_page_after_logged_in() {
		LoggerLoad.info("User is in Operations in Stack Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Operations in Stack"));
	}
	@When("The user clicks {string} button in {string} page")
	public void the_user_clicks_button_in_page(String string, String string2) {
		LoggerLoad.info("Stack Page - Clicking Try here button");
	    stack.clickTryHereButton();
	}
	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("Redirected Stack - TryEditor Page");
		Assert.assertTrue(stack.compareTitle().contains("Assessment"));
	}
	@Given("The user is in the Stack page having an tryEditor with a Run button to test")
	public void the_user_is_in_the_stack_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User is on the Stack - TryEditor Page");
		Assert.assertTrue(stack.compareTitle().contains("Assessment"));
	}
	@When("The user gets input from sheet {string} and {int}")
	public void the_user_gets_input_from_sheet_and(String string, Integer int1) throws IOException{
	    LoggerLoad.info("Stack Page - Getting Valid input from Excel");
		stack.getValidInputFromExcelSheet(int1);		
	}
	@When("The user clicks on Run button after Entering valid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() {
		LoggerLoad.info("Stack - Cliking run button");
		stack.clickRunButton();
	}
	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output() {
		LoggerLoad.info("Stack - Presented with output");
		stack.displayOutput();
	}
	@When("The user gets invalid input from sheet {string} and {int}")
	public void the_user_gets_invalid_input_from_sheet_and(String string, Integer int1) throws IOException, InterruptedException {
		LoggerLoad.info("Stack - Getting invalid input from Excel");
		stack.getInvalidInputFromExcelSheet(int1);
	}
	@When("The user clicks on Run button after Entering invalid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_stack_try_editor() {
		LoggerLoad.info("Stack - Cliking run button");
		stack.clickRunButton();
	}
	@Then("The user should get the error message")
	public void the_user_should_get_the_error_message() {
		LoggerLoad.info("Stack - Display error message");
		stack.displayErrorMessage();
	}
	@When("The user clicks on the Implementation button")
	public void the_user_clicks_on_the_implementation_button() {
		LoggerLoad.info("Stack - Clicking Implementation Link");
		stack.clickImplementationLink();
	}
	@Then("The user should then be directed to Implementation Page")
	public void the_user_should_then_be_directed_to_implementation_page() {
		LoggerLoad.info("Directed to Implementation Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Implementation"));
	}
	@Given("The user is on {string} after logged in")
	public void the_user_is_on__after_logged_in(String title) {
		LoggerLoad.info("User is on Stack Implementation page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Implementation"));
	}
	@When("The user clicks on the Applications button")
	public void the_user_clicks_on_the_applications_button() {
		LoggerLoad.info("Stack - Clicking Applications Link");
		stack.clickApplicationsLink();
	}
	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
		LoggerLoad.info("Directed to Applications Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Applications"));
	}
	@Given("The user is on the Applications stack page after logged in")
	public void the_user_is_on_the_applications_stack_page_after_logged_in() {
		LoggerLoad.info("User is on the Applications Stack Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Applications"));
	}
	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		LoggerLoad.info("Stack - Clicking Practice Questions Link");
		stack.clickPracticeQuestionsLink();
	}	
	@Then("The user should be directed to Practice Questions Page")
	public void the_user_should_be_directed_to_practice_questions_page() {
		LoggerLoad.info("Directed to Practice Questions Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Practice Questions"));
		stack.clickSignout();
	}
}
