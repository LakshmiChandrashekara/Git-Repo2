package com.demoqa.testscripts;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoqa.pages.HomePage;
import com.demoqa.util.Constants;
import com.demoqa.util.PropertiesInstance;
import com.demoqa.util.VerifyAssertion;

public class AddProductsTest {

	VerifyAssertion verifyAssertion = new VerifyAssertion();
	PropertiesInstance propInstance = new PropertiesInstance();
	HomePage page = new HomePage();
	String xpathFile = "/resources/locators/productXath.properties";
	String path = Constants.PROJECT_BASE_PATH + xpathFile;
	Properties properties;
	int i = 0;
	
	
	
	@Test(priority = 1)
	public void openBrowser() {
		page.openBrowser();
	}

	@DataProvider
	public Object[] getCart() {
		Object[] cartProperties = new Object[2];
		cartProperties[0] = properties.getProperty("cart");
		cartProperties[1] = properties.getProperty("grandTotal");
		return cartProperties;
	}
	

	@DataProvider
	public Object[][] getProductProperties() {
		
		properties = propInstance.getPropertiesInstance(path);
		
		Object[][] product = new Object[2][8];
		
		product[0][0] = properties.getProperty("BlackLUX");
		product[0][1] = properties.getProperty("BlackLUXColor");
		product[0][2] = properties.getProperty("BlackLUXSize");
		product[0][3] = properties.getProperty("BlackLUXColorSendkeys");
		product[0][4] = properties.getProperty("BlackLUXSizeSendkeys");
		product[0][5] = properties.getProperty("AddToCart");
		product[0][6] = properties.getProperty("Quantity");
		product[0][7] = properties.getProperty("Price");
		
		
		
		product[1][0] = properties.getProperty("PinkDrop");
		product[1][1] = properties.getProperty("PinkDropColor");
		product[1][2] = properties.getProperty("PinkDropSize");
		product[1][3] = properties.getProperty("PinkDropColorSendkeys");
		product[1][4] = properties.getProperty("PinkDropSizeSendkeys");
		product[1][5] = properties.getProperty("AddToCart");
		product[1][6] = properties.getProperty("Quantity");
		product[1][7] = properties.getProperty("Price");
		
		return product;
	}
	
	
	
	@Test(priority = 2, dataProvider = "getProductProperties")
	public void clickAndSelectTheProductTest(String productName,String productColor, String productSize, String productColorKey, String productSizeKey, String addToCart, String quantity, String price) {
		page.clickOnProduct(productName, productColor, productSize, productColorKey, productSizeKey, addToCart, quantity, price);
	}
	
	@Test(priority = 3,dataProvider = "getCart")
	public void verifyGrandTotalTest(String cart ,String grandTotal) {
		boolean grandTotalvalue = page.verifyGrandTotal(cart, grandTotal);
		verifyAssertion.verifyGrandTotalValue(grandTotalvalue);
	}
}

