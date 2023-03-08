package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProviders.Constants;

public class Stack_POM_Test {

	WebDriver driver;
	
//	String Signin = "https://dsportalapp.herokuapp.com/login";
//	String stack = "https://dsportalapp.herokuapp.com/stack";
//	String stack_app = "https://dsportalapp.herokuapp.com/stack/stack-applications/";
	
	By name = By.name("username");
	By pass = By.name("password");
	By login = By.xpath("//input[@value='Login']");
	By dropdown_menu = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By stack_dropdown = By.xpath("//div[@class='dropdown-menu show']/a[3]");
	By operations = By.linkText("Operations in Stack");
	By implementation = By.linkText("Implementation");
	By applications = By.linkText("Applications");
	By practice_questions = By.linkText("Practice Questions");
	By tryhere_btn = By.xpath("//a[@class='btn btn-info']");
	By editor_box = By.xpath("//*[@id='answer_form']/div/div//textarea");
	By oldcode = By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span");
	By run_btn = By.xpath("//*[@id='answer_form']/button");
	By output = By.id("output");
	By logout = By.linkText("Sign out");
	
	public Stack_POM_Test(WebDriver driver)
	{
		this.driver = driver;
	}	
	public void openPage()
	{
		driver.navigate().to(Constants.SIGNIN);
	}
	public void validUsernamePassword(String username,String password)
	{
		driver.findElement(name).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
	//	System.out.println("username---"+username+"password---"+password);
	}
	public void clickSignin()
	{
		driver.findElement(login).click();
	}
	public String compareTitle() {
		String pageTitle = driver.getTitle();
	//	System.out.println("pageTitle----------"+pageTitle);
		return pageTitle;
    } 
	public void selectDropdown()
	{
		driver.findElement(dropdown_menu).click();
		driver.findElement(stack_dropdown).click();	
	}
	public void clickOperationsStackLink()
	{
		driver.findElement(operations).click();
	}
	public void clickTryHereButton()
	{
		driver.findElement(tryhere_btn).click();
	}
	public void getValidInputFromExcelSheet(int RowNumber) throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/utilities/DS_ALGO_ProjectExcel.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("pythonCode");
		
		XSSFRow row = sheet.getRow(RowNumber);
        String code = row.getCell(0).getStringCellValue();
 
        driver.findElement(editor_box).sendKeys(code);
        
		workbook.close();
	}
	public void clickRunButton()
	{
		driver.findElement(run_btn).click();
	}
	public void displayOutput()
	{
		WebElement outputtext = driver.findElement(output);
		String getoutput = outputtext.getText();
		if(!getoutput.isBlank())
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}
	public void getInvalidInputFromExcelSheet(int RowNumber) throws IOException, InterruptedException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/utilities/DS_ALGO_ProjectExcel.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("pythonCode");
		
		XSSFRow row = sheet.getRow(RowNumber);
        String code = row.getCell(0).getStringCellValue();
        
        WebElement clearbox = driver.findElement(oldcode);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clearbox.click();       
        driver.findElement(editor_box).sendKeys(Keys.chord(Keys.CONTROL,"a"),code);
		workbook.close();
	}
	public void displayErrorMessage()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement outputtext = driver.findElement(output);
		String getoutput = outputtext.getText();
		if(getoutput.isBlank())
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		driver.navigate().to(Constants.STACK);
	}
	public void clickImplementationLink()
	{
		driver.findElement(implementation).click();
	}
	public void clickApplicationsLink()
	{
		driver.findElement(applications).click();
	}
	public void clickPracticeQuestionsLink()
	{	
		driver.navigate().to(Constants.STACK_APP);
		driver.findElement(practice_questions).click();	
	}
	public void clickSignout()
	{
		driver.findElement(logout).click();
	}
}
