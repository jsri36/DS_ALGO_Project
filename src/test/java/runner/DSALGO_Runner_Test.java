package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class) //Junit execution
	
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report.html",   //Cucumber Html report
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",  //Allure report
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  //Extent report
				}, //(Extent report reference - http://ghchirp.online/1697/  & https://www.youtube.com/watch?v=IuEO9AUbwwc&ab_channel=JahmalRichard)
		monochrome=false,  //console output
		tags = " ", //tags from feature file
		features = {"src/test/resources/features"
		},
		glue= "stepdefinitions") //location of step definition files

public class DSALGO_Runner_Test extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
		
    }

}

