package com.demoqa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * This class contains methods to return the instance of the properties file.
 * @author Lakshmi.RC
 *
 */
public class PropertiesInstance {

	/**
	 * This method will return the instance of the specified properties file
	 * @param path
	 * @return
	 */
	public Properties getPropertiesInstance(String path) {
		
		Properties properties = new Properties();
		try {
			FileInputStream inputStream = new FileInputStream(path);
			try {
				properties.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
