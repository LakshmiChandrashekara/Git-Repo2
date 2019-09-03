package com.atmecs.demoqa.extendreports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.demoqa.utils.Constants;
import com.atmecs.demoqa.utils.LoadExcel;

public class Demo {

//	static int i = 4;
//	
//		LoadExcel excel = new LoadExcel();
//		Object[][] data;
	public static void main(String[] agrs) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVE_EXE);
		driver = new ChromeDriver();
		driver.get("http://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(xpathExpression));
		
		
	}		
		
}
		
//		String value = "("+"//span[@class='woocommerce-Price-amount amount'])"+"["+i+"]";
//		//String price = driver.findElement(By.xpath(("//span[@class='woocommerce-Price-amount amount'])"+"["+i+"]"))).getText();
//		//System.out.println("price is: "+value);
//		
//		@DataProvider
//		public Object[][] test1() {
//			data = excel.getData("C:\\Users\\Lakshmi.RC\\Assessment-2\\DemoQA\\resources\\testdata\\Demo2.xlsx", "Sheet1");
//			return data;
//		}
//		
//		@Test(dataProvider="test1")
//		public void test(String number, String number1, String number2) {
//			System.out.println("String data"+number);
//			System.out.println("int data"+number1);
//			System.out.println("double data"+number2);
//		}
//		
//	}
	
	
//	public static void main(String[] agrs) {
//		String addProductDiscrption = "";
//		String product_Discription = "PINK DROP SHOULDER OVERSIZED T SHIRT";
//		String[] addProduct = product_Discription.split(" ");
//		
//		for(int i=0; i<addProduct.length; i++) {
//			addProductDiscrption = addProductDiscrption+"_"+addProduct[i];
//		}
//		
//		System.out.println("after addting underscore: "+addProductDiscrption);
//		//String discription = driver.findElement(By.xpath(properties.getProperty(productDiscrption))).getText();
//		
//	}
//	
//}

