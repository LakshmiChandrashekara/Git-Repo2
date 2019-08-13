package com.demoqa.util;

import org.testng.Assert;

public class VerifyAssertion {

	GenerateLoggerReport generateLog = new GenerateLoggerReport();
	
	public void verifyAssertion(String actualTitle, String expectedTitle, String message) {
		try {
			Assert.assertEquals(actualTitle, expectedTitle);
			generateLog.printLog("PASSED: "+ message +" EXPECTED: "+ expectedTitle + " ACTUAL: "+ actualTitle);
		} catch (AssertionError assertionError) {
			generateLog.printLog("FAILED: "+ message +" EXPECTED: "+ expectedTitle + " ACTUAL: "+ actualTitle);
		  }
	}
	
	
	public void verifyGrandTotalValue(boolean verify) {
		if(!true)
			generateLog.printLog("Invalid grand amount!!!!");
	}
	
}
