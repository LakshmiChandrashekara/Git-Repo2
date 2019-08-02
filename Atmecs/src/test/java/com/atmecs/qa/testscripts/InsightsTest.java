package com.atmecs.qa.testscripts;

//import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.InsightsPage;

public class InsightsTest {

InsightsPage insightspage = new InsightsPage();
	
	@BeforeTest
	public void getBrowser() {
		insightspage.openBrowser();
	}
	
	@Test
	public void testInsights() {
		insightspage.mouseOverOnInsights();
		//Assert.assertEquals(expectedTitle, actualTitle);
	}
	
/*	@AfterTest
	public void tearDown()
	{
		insightspage.quitBrowser();
	}
*/	
}
