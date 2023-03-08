package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProviders.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.HomePage_POM_Test;
import utilities.LoggerLoad;

public class HomePage_SD_Test {

	HomePage_POM_Test home =null;
	WebDriver driver =null;
	{
		driver = DriverManager.getDriver();
		
		home  = new HomePage_POM_Test(driver);
	}
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		LoggerLoad.info("open browser");
		home.openPage();
	}
	
	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		LoggerLoad.info("click start");
		home.clickstart();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		LoggerLoad.info("check home");
        Assert.assertTrue(home.compareTitle().contains("NumpyNinja"));
	}
	
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		LoggerLoad.info("on home");
		Assert.assertTrue(home.compareTitle().contains("NumpyNinja"));
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) {
		LoggerLoad.info("Example");
		home.clickGetStarted(option);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String expected_result) {
		LoggerLoad.info("Message");
		Assert.assertEquals(home.compareMessage(), expected_result); 	
	}
	
	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String option) {
		home.clickDropdown(option);		
	}
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		home.openHomePage();	
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
		home.signInandRegister(string);
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		 Assert.assertTrue(home.compareTitle().contains("Login"));
	}
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		Assert.assertTrue(home.compareTitle().contains("Registration"));
	}
}
