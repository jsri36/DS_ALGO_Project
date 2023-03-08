package stepdefinitions;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import dataProviders.CommonUtils;
import dataProviders.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.LoggerLoad;

public class Hooks {
	
	@Before
	public void beforeScenario()
	{
		LoggerLoad.info("Before Scenario");
		try
		{
			CommonUtils commonutils = new CommonUtils();
			commonutils.loadProperties();
			if(DriverManager.getDriver()==null)
			{
				DriverManager.launchBrowser();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@After
	public void tearDown(Scenario scenario) {
		LoggerLoad.info("After Scenario");
        //validate if scenario has failed
        if(scenario.isFailed()) {     	
        	byte[] screenshot = ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        	Allure.addAttachment("FailedScreenshot/", "image/png", new ByteArrayInputStream(screenshot), ".png");        	
       }   
    }
}
