package com.atmecs.qa.helper;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class StoreDriver {

	 static Set<WebDriver> set = new HashSet<WebDriver>();
	 public static void storeDriver(WebDriver driver)
	 {
		 System.out.println(driver);
		 set.add(driver);
	 }
	
}
