package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProviders.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.SignInPage_POM_Test;
import utilities.LoggerLoad;

public class SignInPage_SD_Test {

	SignInPage_POM_Test signin =null;
	WebDriver driver =null;
	{
		driver = DriverManager.getDriver();
		
		signin  = new SignInPage_POM_Test(driver);
	}	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		LoggerLoad.info("Info  - The User is on Signin Page");
		signin.openPage();
	}
	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
	   signin.clickRegister();
	}
	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
	  Assert.assertTrue(signin.compareTitle().contains("Registration"));
	}
	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String string, String string2) {
	    signin.InvalidUsernamePassword(string, string2);
	}
	@Then("click login button to verify")
	public void click_login_button_to_verify() {
	    signin.clickSignin();
	    Assert.assertTrue(signin.loginFail().contains("Login"));
	}
	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String string, Integer int1) throws IOException {
		 signin.readExcelSheet(int1);
	}
	@Then("click login button")
	public void click_login_button() {
		 signin.clickSignin();
	}
	@Given("The user is in the Home page with valid log in")
	public void the_user_is_in_the_home_page_with_valid_log_in() {
	    Assert.assertTrue(signin.compareTitle().contains("NumpyNinja"));
	}
	@When("The user clicks on {string}")
	public void the_user_clicks_on(String string) {
		signin.clickSignout();
	}
	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
	   Assert.assertTrue(signin.compareTitle().contains("NumpyNinja"));
	}
}
