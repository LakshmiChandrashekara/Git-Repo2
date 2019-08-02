package com.atmecs.qa.utility;

import java.util.Properties;

import org.openqa.selenium.By;

import com.atmecs.qa.testbase.Base;

public class NavigateTo {

	Base base = new Base();
	Properties properties;
	public By navigateTo(String propertiesFilePath, String  webElement) {
		properties = base.readProperties(propertiesFilePath);
		By element = By.xpath(properties.getProperty(webElement));
		return element;
		
	}
	
	public String navigateRandom(String propertiesFilePath, String  webElement) {
		By by = navigateTo(propertiesFilePath,webElement);
		String name = by.toString();
		//String element = getSelectorAsString(by);
		System.out.println("converted element "+name);
		return name;
	}
	
/*	public String getSelectorAsString(By by) {
        String byToString = by.toString();
        return byToString.substring(byToString.indexOf(" ") , byToString.length());
      } */
}
