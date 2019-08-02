package com.atmecs.qa.utility;

import java.util.Properties;

import org.openqa.selenium.By;

import com.atmecs.qa.testbase.Base;

public class GetPropertiesFile {
	
	Properties prop;
	Base base = new Base();
	int indexNumber;

	public String getProperties(String path, String getElement) {
		Properties prop = base.readProperties(path);
		
		
		
		
		try {
			indexNumber = Integer.parseInt(getElement);
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		
		String element = prop.getProperty(getElement);
		return element;
		
	}	
	
	




	public By getCaseStudies(String getElement) {
		String path = Constants.PROJECT_BASE_PATH + "/resources/locators/CaseStudies.properties";
		Properties prop = base.readProperties(path);
		By webElement = (By.linkText(prop.getProperty(getElement)));
		return webElement;
	}	
}
