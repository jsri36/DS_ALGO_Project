package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProviders.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Queue_POM_Test;
import utilities.LoggerLoad;

public class Queue_SD_Test {
	
	Queue_POM_Test queue =null;
	WebDriver driver =null;

	{
		driver = DriverManager.getDriver();
		queue = new Queue_POM_Test(driver);
	}
	@Given("The user is on the Signin page of DS Algo portal")
	public void the_user_is_on_the_signin_page_of_ds_algo_portal() {
		LoggerLoad.info("User is on Signin page to test Queue");
		queue.openPage();
	}
	@When("The user enters valid {string} and {string}")
	public void the_user_enters_valid_and(String username, String password) {
		LoggerLoad.info("Entering username & password");
		queue.validUsernamePassword(username, password);
	}
	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		LoggerLoad.info("Clicks login button");
		queue.clickSignin();
	}
	@Then("User redirected to homepage")
	public void user_redirected_to_homepage() {
		LoggerLoad.info("Queue - Redirected to home page");
		Assert.assertTrue(queue.compareTitle().contains("NumpyNinja"));
	}
	@Given("The user is in the Home page")
	public void the_user_is_in_the_home_page() {
		LoggerLoad.info("Queue - User is in the Home page");
		Assert.assertTrue(queue.compareTitle().contentEquals("NumpyNinja"));
	}
	@When("The user clicks the Queue item from drop down menu")
	public void the_user_clicks_the_queue_item_from_drop_down_menu() {
		LoggerLoad.info("Selecting Queue from drop down");
		queue.selectDropdown();
	}
	@Then("The user should be directed to Queue Data Structure Page")
	public void the_user_should_be_directed_to_queue_data_structure_page() {
		LoggerLoad.info("Directed to Queue Data Structure Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Queue"));
	}
	@Given("The user is in Queue Page")
	public void the_user_is_in_queue_page() {
		LoggerLoad.info("User is in the Queue page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Queue"));
	}
	@When("The user clicks on Implementation of queue in Python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() {
		LoggerLoad.info("Clicking Implementation of queue in Python Link");
		queue.clickImplementationOfQueueLink();
	}
	@Then("The user should be directed to Implementation of queue in Python Page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
		LoggerLoad.info("Directed to Implementation of queue in Python Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation of Queue in Python"));
	}
	@Given("The user is in Implementation of queue in Python Page")
	public void the_user_is_in_implementation_of_queue_in_python_page() {
		LoggerLoad.info("User is in Implementation of Queue in Python page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation of Queue in Python"));
	}
	@When("The user clicks on Try here link")
	public void the_user_clicks_on_try_here_link() {
		LoggerLoad.info("Queue Page - Clicking Try here button");
	    queue.clickTryHereButton();
	}
	@Then("The user navigates to Editor page with Run button")
	public void the_user_navigates_to_editor_page_with_run_button() {
		LoggerLoad.info("Redirected Queue - TryEditor Page");
		Assert.assertTrue(queue.compareTitle().contains("Assessment"));
	}
	@Given("The user is in a page having an Editor with a Run Button to Test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User is on the Queue - TryEditor Page");
		Assert.assertTrue(queue.compareTitle().contains("Assessment"));
	}
	@When("The user enters valid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet_and(String string, Integer int1) throws IOException {
		LoggerLoad.info("Queue Page - Getting Valid input from Excel");
		queue.getValidInputFromExcelSheet(int1);
	}
	@When("clicks Run Button")
	public void clicks_run_button() {
		LoggerLoad.info("Queue Page- Cliking run button");
		queue.clickRunButton();
	}
	@Then("The user is presented with the result after Run Button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
		LoggerLoad.info("Queue Page - Presented with output");
		queue.displayOutput();
	}
	@When("The user enters invalid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String string, Integer int1) throws IOException, InterruptedException {
		LoggerLoad.info("Queue - Getting invalid input from Excel");
		queue.getInvalidInputFromExcelSheet(int1);
	}
	@Then("The user gets an Error Message")
	public void the_user_gets_an_error_message() {
		LoggerLoad.info("Queue - Display error message");
		queue.displayErrorMessage();
	}
	@When("The user clicks on Implementation using collections deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
		LoggerLoad.info("Queue - Clicking Implementation using collections.deque Link");
		queue.clickImplementationUsingCollectionsLink();
	}
	@Then("The user should be redirected to Implementation using collections deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		LoggerLoad.info("Directed to Implementation using collections deque Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation using collections.deque"));
	}
	@Given("The user in implementation using collections page")
	public void the_user_in_implementation_using_collections_page() {
		LoggerLoad.info("User is in Implementation using collections.deque page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation using collections.deque"));
	}
	@When("The user clicks on Implementation using array link")
	public void the_user_clicks_on_implementation_using_array_link() {
		LoggerLoad.info("Queue - Clicking Implementation using array Link");
		queue.clickImplementationUsingArrayLink();
	}
	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		LoggerLoad.info("Directed to Implementation using array Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation using array"));
	}
	@Given("The user in Implementation using array page")
	public void the_user_in_implementation_using_array_page() {
		LoggerLoad.info("User is in Implementation using array page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation using array"));	
	}
	@When("The user clicks on Queue Operations link")
	public void the_user_clicks_on_queue_operations_link() {
		LoggerLoad.info("Queue - Clicking Queue Operations Link");
		queue.clickQueueOperationsLink();
	}
	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		LoggerLoad.info("Directed to Queue Operations Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Queue Operations"));
	}
	@Given("The user in Queue Operations page")
	public void the_user_in_queue_operations_page() {
		LoggerLoad.info("User is in Queue Operations page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Queue Operations"));
	}
	@Given("The user is in Editor page and navigates to QueueOp page")
	public void the_user_is_in_editor_page_and_navigates_to_queue_op_page() {
		LoggerLoad.info("Queue - navigates to QueueOp page");
		queue.navigateToQueueOpPage();
	}
	@When("The user clicks on Practice Questions")
	public void the_user_clicks_on_practice_questions() {
		LoggerLoad.info("Queue - Clicking Practice Questions Link");
		queue.clickPracticeQuestionsLink();
	}
	@Then("The user is directed to Practice page")
	public void the_user_is_directed_to_practice_page() {
		LoggerLoad.info("Queue - Directed to Practice Questions Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Practice Questions"));
		queue.clickSignout();
	}
}
