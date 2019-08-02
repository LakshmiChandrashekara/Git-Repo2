package com.atmecs.qa.helper;

import java.util.Properties;

import org.openqa.selenium.By;

import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utility.Constants;

public class GetInsightsProperties {
	Base base = new Base();

	public By[] getInsights() {
		By[] by = new By[10];
		
		String path = Constants.PROJECT_BASE_PATH + "/resources/locators/Insights.properties";
		Properties prop = base.readProperties(path);
		By Insightselement = (By.xpath(prop.getProperty("insights")));
		By CaseStudieselement = (By.xpath(prop.getProperty("caseStudies")));
		By Blogselement = (By.xpath(prop.getProperty("blogs")));
		By thisWeekInDigitalElement = (By.xpath(prop.getProperty("thisWeekInDigital")));
		By webinarsElement = (By.xpath(prop.getProperty("webinars")));
		
		by[0] = Insightselement;
		by[1] = CaseStudieselement;
		by[2] = Blogselement;
		by[3] = thisWeekInDigitalElement;
		by[4] = webinarsElement;
		
		return by;
	}
	
	
}
