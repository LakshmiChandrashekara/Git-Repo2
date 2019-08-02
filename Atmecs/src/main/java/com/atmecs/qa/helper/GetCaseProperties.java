package com.atmecs.qa.helper;

//import java.util.Properties;

import org.openqa.selenium.By;

import com.atmecs.qa.pages.CaseStudiesPage;
//import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.GetPropertiesFile;
import com.atmecs.qa.utility.GetRandomNumber;
import com.atmecs.qa.utility.NavigateTo;

public class GetCaseProperties {
	
	NavigateTo navigate = new NavigateTo();
	GetRandomNumber randomNumber = new GetRandomNumber();
	//CaseStudiesPage casePage = new CaseStudiesPage();
	GetPropertiesFile file = new GetPropertiesFile();
	String path = Constants.PROJECT_BASE_PATH + "/resources/locators/CaseStudies.properties";
	String RandomFilePath = Constants.PROJECT_BASE_PATH + "/resources/locators/CaseStudiesLink.properties";
	int totalElements;
	final int minimumElements = 1;
	int randomlyGeneratedNumber;
	
/*	Base base = new Base();
	
	public By getCaseStudies(String getElement) {
		String path = Constants.PROJECT_BASE_PATH + "/resources/locators/CaseStudies.properties";
		Properties prop = base.readProperties(path);
		By webElement = (By.linkText(prop.getProperty(getElement)));
		return webElement;
	}	
	
	public By getCaseStudies(String getElement) {
		String element = file.getProperties(path,getElement);
		By webElement = (By.xpath(element));
		return webElement;
		
	
	}  */
	
	public String getRandomXpath(String number)
	{
		
		String element = (String) navigate.navigateRandom(RandomFilePath, number);
		System.out.println("same element in getRandomXpath==== "+ element);
		return element;
	}
	
	public String getRandomPropertiesFilePath() {
		return RandomFilePath;
	}
	
	
	
/*	public String getWebElementName()
	{
		totalElements = casePage.getTotalWebElements();
		randomlyGeneratedNumber = randomNumber.generateRandomNumber(totalElements, minimumElements);
		
		return "";
	}	*/
	
	
}
