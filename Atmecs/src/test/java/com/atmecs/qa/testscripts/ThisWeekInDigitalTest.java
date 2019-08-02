package com.atmecs.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.InsightsPage;

public class ThisWeekInDigitalTest {
	
	InsightsPage insightspage = new InsightsPage();
	
	@BeforeTest
	public void getBrowser() {
		insightspage.openBrowser();
	}
	
	@Test
	public void testThisWeekInDigital() {
		
		insightspage.mouseOverOnInsights();
		String actualTitle = insightspage.thisWeekInDigital();
		String expectedTitle = "This Week In Digital | Atmecs, Inc. | Digital Solutions & Product Engineering Services";
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
