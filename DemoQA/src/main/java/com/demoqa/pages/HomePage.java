package com.demoqa.pages;

import org.openqa.selenium.By;


import com.demoqa.testbase.Base;
import com.demoqa.util.PropertiesInstance;
import com.demoqa.util.VerifyAssertion;

public class HomePage extends Base {

	
	PropertiesInstance propInstance = new PropertiesInstance();
	VerifyAssertion verifyAssert = new VerifyAssertion();
	int count = 0, sum = 0;
	String actualTitle;
	String expectedTitle;
	

	public void clickOnProduct(String productName,String productColor, String productSize, String productColorKey, String productSizeKey, String addToCart, String quantity, String price) {
		driver.findElement(By.xpath(productName)).click();
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verifyAssert.verifyAssertion(actualTitle, expectedTitle, "ClickOnProduct");
		selectProductProperties(productColor,productSize,productColorKey,productSizeKey,addToCart);
		count++;
		if(count==1)
			driver.findElement(By.xpath("(//img[@src=\"http://shop.demoqa.com/wp-content/uploads/2019/04/cropped-SHOP-1.png\"])[1]")).click();
		verifyCartTotalPrice(quantity, price);
	}
	
	
	public void selectProductProperties(String productColor, String productSize, String productColorKey,String productSizeKey, String addToCart) {
		driver.findElement(By.xpath(productColor)).sendKeys(productColorKey);
		driver.findElement(By.xpath(productSize)).sendKeys(productSizeKey);
		driver.findElement(By.xpath(addToCart)).click();
		actualTitle = driver.getTitle();
		expectedTitle = actualTitle;
		verifyAssert.verifyAssertion(actualTitle, expectedTitle, "SelectProduct");
	}
	
	
	public void verifyCartTotalPrice(String quantity, String price) {
		int quantityNumber = Integer.parseInt(driver.findElement(By.xpath(quantity)).getText());
		
		int totalPrice = Integer.parseInt(driver.findElement(By.xpath(price)).getText());
		sum = (quantityNumber * totalPrice);
	}
	
	
	public boolean verifyGrandTotal(String cart ,String grandTotal) {
		driver.findElement(By.xpath(cart)).click();
		int grandTotalValue = Integer.parseInt(driver.findElement(By.xpath(grandTotal)).getText());
		if(sum==grandTotalValue)
			return true;
		else
			return false;
			
	}
}
