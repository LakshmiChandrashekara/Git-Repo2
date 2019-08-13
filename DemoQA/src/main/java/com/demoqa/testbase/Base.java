package com.demoqa.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.demoqa.util.Constants;
import com.demoqa.util.PropertiesInstance;

public class Base {

	PropertiesInstance propInstance = new PropertiesInstance();
	
	public WebDriver driver;
	String browserPath = "/resources/constants.properties";
	String path = Constants.PROJECT_BASE_PATH + browserPath;
	Properties properties;
	String chromePath;
	String firefoxPath;
	String internetExplorerPath;
			
	
	
	
	/**
	 * This method will instantiate the object of specified browser
	 */
	public void openBrowser() {
		
		properties = propInstance.getPropertiesInstance(path);
		chromePath = Constants.PROJECT_BASE_PATH+properties.getProperty("ChromeDriverPath");
		firefoxPath = Constants.PROJECT_BASE_PATH+properties.getProperty("FirefoxDriverPath");
		internetExplorerPath = Constants.PROJECT_BASE_PATH+properties.getProperty("IEDriverPath");
		
		if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",chromePath);
			driver = new ChromeDriver();
		} 
		else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",firefoxPath);
			driver = new FirefoxDriver();
		}

		else if (properties.getProperty("browser").equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.ie.driver",internetExplorerPath);
			driver = new InternetExplorerDriver();
		}
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	
	public WebDriver getDriverInstance() {
		return driver;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
//		String path = Constants.PROJECT_BASE_PATH + "/resources/Config.properties";
//		Properties prop = readProperties(path);
//		String chromePath = Constants.PROJECT_BASE_PATH+prop.getProperty("ChromeDriverPath");
//		String firefoxPath = Constants.PROJECT_BASE_PATH+prop.getProperty("FirefoxDriverPath");
//		String internetExplorerPath = Constants.PROJECT_BASE_PATH+prop.getProperty("IEDriverPath");
//		
//		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver",chromePath);
//			driver = new ChromeDriver();
//		} 
//		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver",firefoxPath);
//			driver = new FirefoxDriver();
//		}
//
//		else if (prop.getProperty("browser").equalsIgnoreCase("internetexplorer")) {
//			System.setProperty("webdriver.ie.driver",internetExplorerPath);
//			driver = new InternetExplorerDriver();
//		}
//		driver.get(prop.getProperty("url"));
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
//
//	}
//	
//}
