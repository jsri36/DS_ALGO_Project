package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProviders.Constants;

public class HomePage_POM_Test {

	WebDriver driver;
	
	By startbtn = By.className("btn");
	By result = By.xpath("//div[@class='alert alert-primary']");
	
	By dsbtn = By.xpath("//h5[contains(text(),'Data Structures')]/../a");
	By arraybtn = By.xpath("//h5[contains(text(),'Array')]/../a");
	By linkedlistbtn = By.xpath("//h5[contains(text(),'Linked List')]/../a");
	By stackbtn = By.xpath("//h5[contains(text(),'Stack')]/../a");
	By queuebtn = By.xpath("//h5[contains(text(),'Queue')]/../a");
	By treebtn = By.xpath("//h5[contains(text(),'Tree')]/../a");
	By graphbtn = By.xpath("//h5[contains(text(),'Graph')]/../a");
	
	By dropdown_menu = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By arraydd = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By linkedlistdd = By.xpath("//div[@class='dropdown-menu show']/a[2]");
	By stackdd = By.xpath("//div[@class='dropdown-menu show']/a[3]");
	By queuedd = By.xpath("//div[@class='dropdown-menu show']/a[4]");
	By treedd = By.xpath("//div[@class='dropdown-menu show']/a[5]");
	By graphdd = By.xpath("//div[@class='dropdown-menu show']/a[6]");
	
	By signin = By.linkText("Sign in");
	By register= By.linkText("Register");
	
	public HomePage_POM_Test(WebDriver driver)
	{
		this.driver = driver;
	}	
	public void openPage() {
		driver.get(Constants.APP_URL);       
    }
	public void clickstart()
	{
		driver.findElement(startbtn).click();
	}
	public String compareMessage() {
		String actual_result = driver.findElement(result).getText();
        return actual_result;
    }
	public String compareTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
    }  
	public void clickGetStarted(String option) {
		switch (option) {
        case "Data Structures":
			        driver.findElement(dsbtn).click();      
			        break;
        case "Array":
			        driver.findElement(arraybtn).click();   
			        break;
        case "Linked List":
			        driver.findElement(linkedlistbtn).click();
			        break;
        case "Stack":
			        driver.findElement(stackbtn).click();
			        break;
        case "Queue":
			       	driver.findElement(queuebtn).click();
			        break;
        case "Tree":
			       	driver.findElement(treebtn).click();
			       	break;
        case "Graph":
			        driver.findElement(graphbtn).click();
			        break;
             
        default:
            throw new IllegalArgumentException("Invalid option: " + option);
    } 
	}
	public void clickDropdown(String option)
	{
		driver.findElement(dropdown_menu).click();
		switch (option) {
        case "Array":        	
		        	driver.findElement(arraydd).click();   
		        	break;
        case "Linkedlist":
		        	driver.findElement(linkedlistdd).click();
		        	break;
        case "Stack":
		        	driver.findElement(stackdd).click();
		            break;
        case "Queue":
		        	driver.findElement(queuedd).click();
		            break;
        case "Tree":
  		        	driver.findElement(treedd).click();
		            break;
        case "Graph":
		        	driver.findElement(graphdd).click();
		            break;
        default:
            throw new IllegalArgumentException("Invalid option: " + option);
    }
	}
	public void openHomePage() {
		driver.navigate().to(Constants.HOME);     
    }
	public void signInandRegister(String option) 
	{
		switch (option) {
        case "Sign in":
        			driver.findElement(signin).click();     
			        break;
        case "Register":
        			driver.findElement(register).click();
			        break;
        default:
            throw new IllegalArgumentException("Invalid option: " + option);
	}
	}
}
