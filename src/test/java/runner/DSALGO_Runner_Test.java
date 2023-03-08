package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class) //Junit execution
	
@CucumberOptions(
		plugin = {"pretty", "html:target/jsri36.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, //reporting purpose
		monochrome=false,  //console output
		tags = " ", //tags from feature file
		features = "src/test/resources/features",
		glue= "stepdefinitions") //location of step definition files

public class DSALGO_Runner_Test extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
		
    }

}

