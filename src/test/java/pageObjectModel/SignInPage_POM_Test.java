package pageObjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProviders.Constants;

public class SignInPage_POM_Test {
	
	WebDriver driver;
	
	By registerlink = By.linkText("Register");
	By name = By.name("username");
	By pass = By.name("password");
	By login = By.xpath("//input[@value='Login']");
	By logout = By.linkText("Sign out");
	
	public SignInPage_POM_Test(WebDriver driver)
	{
		this.driver = driver;
	}	
	public void openPage()
	{
		driver.navigate().to(Constants.SIGNIN);		
	}
	public void clickRegister()
	{
		driver.findElement(registerlink).click();
	}
	public String compareTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
    }  
	public void InvalidUsernamePassword(String username,String password)
	{
		driver.findElement(name).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
	//	System.out.println("username---"+username+"password---"+password);
	}
	public void clickSignin()
	{
		driver.findElement(login).click();
	}
	public String loginFail()
	{
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	public void readExcelSheet(int RowNumber) throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/utilities/DS_ALGO_ProjectExcel.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(RowNumber);
        String username = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();
//		System.out.print("Username----"+username+"Password----"+password);
		driver.findElement(name).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		
		workbook.close();
	}
	public void clickSignout()
	{
		driver.findElement(logout).click();
	}
}
