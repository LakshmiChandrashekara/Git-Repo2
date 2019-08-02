package com.atmecs.qa.helper;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.atmecs.qa.utility.Constants;

public class Demo {

WebDriver driver ;
	
	@Test
	public void test()
	{
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi.RC\\Atmecs_Workspace\\Atmecs\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.atmecs.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LODE_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);

	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Insights')]"))).build().perform();
	driver.findElement(By.xpath("//a[@href='http://www.atmecs.com/case-studies/']")).click();
	driver.findElement(By.xpath("//a[@href='http://www.atmecs.com/case-studies/noc-services/']")).click();
	//List<WebElement> links = driver.findElements(By.xpath("//div[@class='wpb_column vc_column_container vc_col-sm-4']"));
	//System.out.println(links.size());
	
	//Iterator iterator = links.iterator();
/*	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	
	
	
	
	/*for(WebElement element : links )
	{
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("//a[@href='http://www.atmecs.com/blogs/']")).click();
	//driver.findElement(By.xpath("//a[@href='http://www.atmecs.com/this-week-in-digital/']")).click();
	
	//}
	
	
	
	
	}
}
