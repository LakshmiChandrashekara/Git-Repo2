package com.atmecs.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.atmecs.qa.helper.GetCaseProperties;
import com.atmecs.qa.helper.GetInsightsProperties;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utility.Constants;
import com.atmecs.qa.utility.GetRandomNumber;
import com.atmecs.qa.utility.NavigateTo;

public class InsightsPage extends Base {
	
	GetCaseProperties getCaseProperties = new GetCaseProperties();
	CaseStudiesPage caseStudiesPage = new CaseStudiesPage();
	GetRandomNumber getRandomNumber = new GetRandomNumber();
	NavigateTo navigate = new NavigateTo();
	GetInsightsProperties getProperty = new GetInsightsProperties();
	String randomPath;
	int totalElementsPresent;
	final int minimum = 1;
	int number ;
	String randomNumber;
	//String propertiesFilePath;
    //By[] getXpaths = new By[10];
    
    
	public void mouseOverOnInsights() {	
		System.out.println("driver in insights "+ driver);
		Actions action = new Actions(driver);
		String propertiesFilePath = getPropertiesFilePath();
		//String propertiesFilePath = getPropertiesFilePath();
		By insights = navigate.navigateTo(propertiesFilePath, "insights");
		action.moveToElement(driver.findElement(insights)).build().perform();
	}
	
	
	
	
	
	public void caseStudies() {
		mouseOverOnInsights();
		By caseStudies = caseStudiesPage.clickCaseStudies();
		driver.findElement(caseStudies).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Case Studies | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		int totalElementsPresent = getTotalWebElements();
		number = getRandomNumber.generateRandomNumber(totalElementsPresent, minimum);
		System.out.println("random number is "+number);
		
		randomNumber = String.valueOf(number);
		String randomElement = getCaseProperties.getRandomXpath(randomNumber);
		System.out.println(randomElement);
		String element = randomElement.toString();
		System.out.println("element converted from string to By ===="+element);
		
		//navigate.navigateTo(propertiesFilePath, randomElement);
		
		
		String randompropertiesFilePath = caseStudiesPage.getCaseLinkPropertiesFilePath();
		System.out.println("path to find the ramdom element xpath ==== "+randompropertiesFilePath);
		
		By randomLinkElement = navigate.navigateTo(randompropertiesFilePath, element);
		System.out.println("Ramdomely generated xpath "+randomLinkElement);
		
		driver.findElement(randomLinkElement).click();
		String randomElementTitle = driver.getTitle();
		System.out.println("Random element titile is :"+randomElementTitle);
		//randomPath = getCaseProperties.getRandomPropertiesFilePath();
		
		
		
		
		
		
		
		
		//GetCaseProperties caseProperties = new GetCaseProperties();
		//String propertiesFilePath = caseProperties.getPropertiesFilePath ();
		//By caseStudies = navigate.navigateTo(propertiesFilePath, "CaseStudies");
		
		//driver.findElement(getXpaths[1]).click();
		//String actualTitle = driver.getTitle();
		//return actualTitle;
	}
	
	public int getTotalWebElements() {
		
		By totalElements = navigate.navigateTo(caseStudiesPage.getCasePropertiesFilePath(), "totalWebElements");
		//List<WebElement> links = driver.findElements(By.xpath("//div[@class='wpb_column vc_column_container vc_col-sm-4']"));
		List<WebElement> links = driver.findElements(totalElements);
		totalElementsPresent = links.size();
		System.out.println("total elements present is :"+totalElementsPresent);
		return totalElementsPresent;
	}
	
	/*		public String blogs() {
		mouseOverOnInsights();
		driver.findElement(getXpaths[2]).click();
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	
	public String thisWeekInDigital() {
		mouseOverOnInsights();
		driver.findElement(getXpaths[3]).click();
		//driver.findElement(getXpaths[thisWeekInDigital]).click();
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	
	public String webinars() {
		mouseOverOnInsights();
		driver.findElement(getXpaths[4]).click();
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	
	public void getPaths() {
		getXpaths = getProperty.getInsights();
	}
	
	*/
    
	public String getPropertiesFilePath() {
		String path = Constants.PROJECT_BASE_PATH + "/resources/locators/Insights.properties";
		return path;
	}
	
    
    
    
}
	



