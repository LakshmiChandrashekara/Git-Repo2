package com.atmecs.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.CaseStudiesPage;
import com.atmecs.qa.pages.InsightsPage;

public class CaseStudiesTest {
	
	//CaseStudiesPage caseStudiesPage = new CaseStudiesPage();
	InsightsPage insightspage =new InsightsPage();
	
	@BeforeTest
	public void getBrowser() {
		insightspage.openBrowser();
	}
	
	
	
	@Test
	public void testCaseStudies() {
		insightspage.caseStudies();
		
		//caseStudiesPage.clickCaseStudies();
		//insightspage.mouseOverOnInsights();
		//String actualTitle = insightspage.caseStudies();
		//insightspage.caseStudies();
		//String expectedTitle = "Case Studies | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		//Assert.assertEquals(expectedTitle, actualTitle);
		
		
		
	}
	
	/*@AfterTest
	public void tearDown()
	{
		insightspage.quitBrowser();
	}*/
}
