package dataProviders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;

public class DriverManager {
	
	public static WebDriver driver =null;
	
	public static void launchBrowser() {
	
		try {
			
			switch(Constants.BROWSER){

			case "CHROME":
				WebDriverManager.chromedriver().setup();
				LoggerLoad.info("Launching" +Constants.BROWSER);
				driver=new ChromeDriver();
				break;
				
			case "FIREFOX":
				WebDriverManager.firefoxdriver().setup();
				LoggerLoad.info("Launching" +Constants.BROWSER);
				driver=new FirefoxDriver();
				break;
				
			case "EDGE":
				WebDriverManager.edgedriver().setup();
				LoggerLoad.info("Launching" +Constants.BROWSER);
				driver=new EdgeDriver();
				break;
				
											
			default:
				WebDriverManager.chromedriver().setup();
				LoggerLoad.info("Launching" +Constants.BROWSER);
				driver=new ChromeDriver();
				break;
								
			}		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		driver.manage().window().maximize();
		
	}

	public static WebDriver getDriver() {

		LoggerLoad.info("getDriver");
		
		return driver;
		
	}
	
}
