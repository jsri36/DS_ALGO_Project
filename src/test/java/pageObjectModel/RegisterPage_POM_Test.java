package pageObjectModel;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProviders.Constants;
import io.cucumber.datatable.DataTable;

public class RegisterPage_POM_Test {

	WebDriver driver;
	
	By startbtn = By.className("btn");
	
	By registerbtn = By.xpath("//input[@value='Register']");
	By name = By.name("username");
	By pass = By.name("password1");
	By confirm = By.name("password2");
	By alert = By.xpath("//div[@role='alert']");
	By sucessmessage = By.xpath("//div[@role='alert']");
	By signin = By.linkText("Sign in");
	By signout = By.linkText("Sign out");
	By newname = By.name("username");
	By newpass = By.name("password");
	By login = By.xpath("//input[@value='Login']");

	public RegisterPage_POM_Test(WebDriver driver)
	{
		this.driver=driver;
	}	
	public void openProtal()
	{	
	//	driver.findElement(signout).click();
		driver.get(Constants.APP_URL);    
	}
	public void clickstart()
	{
		driver.findElement(startbtn).click();
	}
	public String compareTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
    } 
	public void openPage()
	{
		driver.navigate().to(Constants.REGISTER);
	}
	public void clickRegister()
	{	
		driver.findElement(registerbtn).click();
	}
	public String usernameMissingMessage() {
		String actual_result = driver.findElement(name).getAttribute("validationMessage"); 
        return actual_result;
    }
	public void enterUsernameOnly(List<String> username) {
		driver.findElement(name).sendKeys(username.get(1));
    }
	public String passwordMissingMessage() {
		String actual_result = driver.findElement(pass).getAttribute("validationMessage"); 
        return actual_result;
    }
	public void enterUsernamePasswordOnly(String username, String password,DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		driver.findElement(name).sendKeys(data.get(0).get(username));
		driver.findElement(pass).sendKeys(data.get(0).get(password));
	}
	public String passwordconfirmationMissingMessage() {
		String actual_result = driver.findElement(confirm).getAttribute("validationMessage"); 
        return actual_result;
    }
	public void enterInvalidUsernameorPassword(String username, String password,String confirmpassword,DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		for (Map<String, String> row : data) {
	        username = row.get("username");
	        password = row.get("password");
	        confirmpassword = row.get("password confirmation");
	        driver.findElement(name).sendKeys(username);        
	        driver.findElement(pass).sendKeys(password);
	        driver.findElement(confirm).sendKeys(confirmpassword);
	 //       System.out.println("Print---------"+username+password+confirmpassword);
		}
	}
	public void passwordMissmatch(String username, String password,String confirmpassword,DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

		for(Map<String,String> row : data)
		{
			username = row.get("username");
			password = row.get("password");
			confirmpassword = row.get("password confirmation");
			
			driver.findElement(name).sendKeys(username);
			driver.findElement(pass).sendKeys(password);
			driver.findElement(confirm).sendKeys(confirmpassword);		
		//	System.out.println("Print---------"+username+password+confirmpassword);
		}
	}
	public String errorMessage() {
		String actual_result = driver.findElement(alert).getText();
        return actual_result;       
    }
	public void enterValidInputs(String username, String password,String confirmpassword,DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		for (Map<String, String> row : data) {
	        username = row.get("username");
	        password = row.get("password");
	        confirmpassword = row.get("password confirmation");
	        driver.findElement(name).sendKeys(username);        
	        driver.findElement(pass).sendKeys(password);
	        driver.findElement(confirm).sendKeys(confirmpassword);
	     //   System.out.println("Print---------"+username+password+confirmpassword);
		}
	}
	public String registerSucess()
	{		
		String actual_result = driver.findElement(sucessmessage).getText();
		System.out.println("actual_result------"+actual_result);
        return actual_result;  
	}
	public void openSignIn()
	{	driver.findElement(signout).click();
		driver.findElement(signin).click();
	}
	public void ClickSignIn(String username,String password)
	{
		driver.findElement(newname).sendKeys(username);
		driver.findElement(newpass).sendKeys(password);		
	}
	public void clickLoginButton()
	{
		driver.findElement(login).click();
	}
	public void clickSignout()
	{
		driver.findElement(signout).click();
	}
}
