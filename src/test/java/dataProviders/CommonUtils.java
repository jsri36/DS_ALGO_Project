package dataProviders;

import java.io.IOException;
import java.util.Properties;

import utilities.LoggerLoad;

public class CommonUtils {

	public  void loadProperties() {
		LoggerLoad.info("loadProperties");
		Properties properties=new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/configs.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Constants.BROWSER=properties.getProperty("BROWSER");
		
		Constants.APP_URL= properties.getProperty("APP_URL");
		Constants.HOME=properties.getProperty("HOME");
		Constants.REGISTER=properties.getProperty("REGISTER");
		Constants.SIGNIN=properties.getProperty("SIGNIN");
		
		Constants.STACK=properties.getProperty("STACK");
		Constants.STACK_APP=properties.getProperty("STACK_APP");
		Constants.QUEUE=properties.getProperty("QUEUE");
		Constants.QUEUE_OP=properties.getProperty("QUEUE_OP");
	}
}
