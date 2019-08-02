package com.atmecs.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.helper.GetCaseProperties;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.GetRandomNumber;
import com.atmecs.qa.utility.NavigateTo;

public class CaseStudiesPage {
	
	GetRandomNumber getRandomNumber = new GetRandomNumber();
	//CaseStudiesPage casePage = new CaseStudiesPage();
	GetCaseProperties getProperty = new GetCaseProperties();
	//InsightsPage insightsPage = new InsightsPage();
	String getElementFromProperties;
	String propertiesPath;
	NavigateTo navigate = new NavigateTo();
	int totalElementsPresent;
	final int minimumNumber = 1; 
	int number;
	String randomNumber ;
	
	
	String path = Constants.PROJECT_BASE_PATH + "/resources/locators/CaseStudies.properties";
	String caseLinkPath = Constants.PROJECT_BASE_PATH + "/resources/locators/CaseStudiesLink.properties";
	
	
	
	public By clickCaseStudies()
	{
		getElementFromProperties = "CaseStudies";
		propertiesPath = getCasePropertiesFilePath();
		By casePath = navigate.navigateTo(propertiesPath, getElementFromProperties);
		return casePath;
		
		
		//By[] byArray = new By[50];
		//System.out.println("driver in case "+ driver);
		
		//System.out.println("driver in case studies" +driver);
		//insightsPage.mouseOverOnInsights();
		
		//By casePath = getProperty.getCaseStudies(getElementFromProperties);
		
		//get the path from the method
		
		
		
		
		
		// = casePath;
		//driver.findElement(casePath).click();
		//driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//String caseStudiesTitle = driver.getTitle();
		//System.out.println(caseStudiesTitle);
		
		
	}
	
/*	public By clickCaseStudiesLinkElements() {
		
	} */
	
	public String getCasePropertiesFilePath() {
		return path;
	}
	
	public String getCaseLinkPropertiesFilePath() {
		return caseLinkPath;
	}
	
	
	
	
	
	/*	totalElementsPresent = getTotalWebElements();
		
		
		
		propertiesPath = getProperty.getPropertiesFilePath();
		//getTotalWebElements();
		number = getRandomNumber.generateRandomNumber(totalElementsPresent, minimumNumber);
		System.out.println("random number is :"+number);
		
		randomNumber = String.valueOf(number);
		
		String randomWebLink = getProperty.getRandomXpath(randomNumber);
		
		By randomXpath = navigate.navigateTo(propertiesPath, randomWebLink);
		driver.findElement(randomXpath).click();
		
		
		//By linkElement = getProperty.getRandomXpath(randomNumber);
		//driver.findElement(linkElement).click();
		
		
	}
	
	public int getTotalWebElements() {
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='wpb_column vc_column_container vc_col-sm-4']"));
		totalElementsPresent = links.size();
		return totalElementsPresent;
	}
	
	/*	public void getElementXpath() {
		final int minimum = 1;
		GetRandomNumber number = new GetRandomNumber();
		number.generateRandomNumber(casePage.getTotalWebElements(), minimum);
	}
	
	public void navigateTo(By element) {
		
		driver.findElement(casePath).click();
	}	*/
}
