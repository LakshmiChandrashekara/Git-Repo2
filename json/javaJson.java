package com.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class javaJson 
{
	public static void main(String[] args) 
	{
		   Student stud1= new Student("Ranjith",001,78);
		   Student stud2= new Student("Srini",005,45);
		   Student stud3= new Student("Shan",056,63);
		   
	       //creating JSONObject 
	       JSONObject object = new JSONObject(); 
	         
	       //putting data to JSONObject 
	       object.put("Student1", stud1); 
	       object.put("Student2", stud2); 
	       object.put("Student3", stud3); 
	         
	       //LinkedHashMap for storing address data
	       Map m = new LinkedHashMap(2); 
	       m.put("city", "Bangalore"); 
	       m.put("state", "karnataka"); 
	     
	         
	       //putting address to JSONObject 
	       object.put("address", m); 
	         
	       // for phone numbers, first create JSONArray  
	       JSONArray array = new JSONArray(); 
	       
	       m = new LinkedHashMap(2); 
	       m.put("College", "RNSIT"); 
	       m.put("number", "080-444825"); 
	         
	       // adding map to list 
	       array.add(m); 
	     
	       // putting College name and phoneNumber to JSONObject 
	       object.put("Deatils", array); 
	         
	       // writing JSON to file:"JSONExample.json" in cwd 
	       PrintWriter pw;
	       try {
	    	   pw = new PrintWriter("JSONExample1.json");
	    	   pw.write(object.toJSONString()); 
	    	   pw.flush(); 
		       pw.close(); 
	       		} catch (FileNotFoundException e) {} 
	     } 
}
