package com.demoqa.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GenerateLoggerReport {

	Logger log=null;
	String logpath = Constants.PROJECT_BASE_PATH + "/resources/log4j/log4j.properties";
	
	public GenerateLoggerReport() {
	log = Logger.getLogger(GenerateLoggerReport.class.getName());
	getloggerConfig();
	}
	
	public void getloggerConfig() {
		PropertyConfigurator.configure(logpath);
		}
	
	public void printLog(String message) {
		log.info(message);
	}
	
}
