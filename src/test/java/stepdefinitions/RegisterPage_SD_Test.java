package stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.RegisterPage_POM_Test;
import utilities.LoggerLoad;

import org.testng.Assert;

import dataProviders.DriverManager;

public class RegisterPage_SD_Test {
	
	WebDriver driver =  null;
	RegisterPage_POM_Test register = null;
	{
	driver = DriverManager.getDriver();
	register  = new RegisterPage_POM_Test(driver);
	}

	@Given("The user opens {string} link")
	public void the_user_opens_link(String string) {
	    register.openProtal();
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
	   register.clickstart();
	}

	@Then("The user should be redirected to home page")
	public void the_user_should_be_redirected_to_home_page() {
		Assert.assertTrue(register.compareTitle().contains("NumpyNinja"));	
	}
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {

		register.openPage();
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
		register.clickRegister();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String expected_result) {
		Assert.assertTrue(register.usernameMissingMessage().contains(expected_result));
		
	}
	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string, List<String> username) {
		register.enterUsernameOnly(username);
		register.clickRegister();
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String expected_result) {
		Assert.assertTrue(register.passwordMissingMessage().contains(expected_result));
	}
	@When("The user clicks {string} button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_password_confirmation_field_empty(String string, String username, String password, DataTable dataTable) {
		register.enterUsernamePasswordOnly(username, password, dataTable);
		register.clickRegister();
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String expected_result) {
		Assert.assertTrue(register.passwordconfirmationMissingMessage().contains(expected_result));
	}
	@When("The user enters a {string} with characters other than Letters, digits and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2, DataTable dataTable) {
		register.enterInvalidUsernameorPassword(string, string, string2, dataTable);		
		register.clickRegister();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String expected_result) {
		LoggerLoad.error("Display Error Message");
		Assert.assertTrue(register.errorMessage().contains(expected_result));		
	}
	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String string, String string2, String string3, DataTable dataTable) {
		register.enterInvalidUsernameorPassword(string, string2, string3, dataTable);		
		register.clickRegister();
	}
	@When("The user clicks {string} button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_button_after_entering_valid_and_different_passwords_in_and_fields(String string, String string2, String string3, String string4, DataTable dataTable) {
	    register.passwordMissmatch(string2, string3, string4, dataTable);
	    register.clickRegister();
	}
	@When("The user enters a valid {string} and {string} with characters less than {int}")
	public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2, Integer int1,DataTable dataTable) {		
		register.enterInvalidUsernameorPassword(string, string2, string2, dataTable);
		register.clickRegister();
	}
	@When("The user enters a valid {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2, DataTable dataTable) {		
		register.enterInvalidUsernameorPassword(string, string2, string2, dataTable);
		register.clickRegister();
	}
	@When("The user enters a valid {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_similar_to_username(String string, String string2, DataTable dataTable) {
		register.enterInvalidUsernameorPassword(string, string2, string2, dataTable);
		register.clickRegister();
	}
	@When("The user enters a valid {string} and commonly used password {string}")
	public void the_user_enters_a_valid_and_commonly_used_password(String string, String string2, DataTable dataTable) {	   
		register.enterInvalidUsernameorPassword(string, string2, string2, dataTable);
		register.clickRegister();
	}
	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3, DataTable dataTable) {	   
		register.enterValidInputs(string, string2, string3, dataTable);
		register.clickRegister();
	}

	@Then("The user should be redirected to Homepage with the message {string}<username>{string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String expected_result,String string2) {
		String result = expected_result + "Numpy@sdet100_100";
	//	System.out.println("expected_result----"+expected_result);
	//	System.out.println("result----"+result);
		Assert.assertTrue(register.compareTitle().contains("NumpyNinja"));		
		Assert.assertEquals(register.registerSucess(), result);
	}
	@Given("The user is in the Sign in page")
	public void the_user_is_in_the_sign_in_page() {
		register.openPage();
		register.openSignIn();
		Assert.assertTrue(register.compareTitle().contains("Login"));		
	}

	@When("The user enters a valid {string} and {string}")
	public void the_user_enters_a_valid_and(String string, String string2) {
	   register.ClickSignIn(string, string2);
	}
	@Then("{string}")
	public void string(String string) {
	   register.clickLoginButton();
	   register.clickSignout();
	}
}
