package runner;

import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Junit execution
	
@CucumberOptions(
		plugin = {"pretty", "html:target/jsri36.html",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}, //(Extent report reference - http://ghchirp.online/1697/  & https://www.youtube.com/watch?v=IuEO9AUbwwc&ab_channel=JahmalRichard)
		monochrome=false,  //console output
		tags = " ", //tags from feature file
		features = {"C:/Users/jsri3/WorkSpace2/DS_ALGO_Project_Final/src/test/resources/features"}, //Need full path
		glue= "stepdefinitions") //location of step definition files

public class DSALGO_Runner_Junit{

}

