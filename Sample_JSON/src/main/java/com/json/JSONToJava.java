package com.json;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONToJava 
{
	public static void main(String[] args) throws Exception  
	   { 
	       // parsing file "JSONExample.json" 
	       Object obj = new JSONParser().parse(new FileReader("JSONDemo.json")); 
	         
	       // typecasting obj to JSONObject 
	       JSONObject object = (JSONObject) obj; 
	         
	       // getting firstName and lastName 
	       Student stud1 = (Student) object.get("Student1"); 
	       Student stud2 = (Student) object.get("Student2"); 
	       System.out.println(stud1.name+" "+stud1.USN+" "+stud1.marks);
	       System.out.println(stud2.name+" "+stud2.USN+" "+stud2.marks);
	    
	       // getting address 
	       Map address = ((Map)object.get("address")); 
	         
	       // iterating address Map 
	     /*  Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
	       while (itr1.hasNext()) { 
	           Map.Entry pair = itr1.next(); 
	           System.out.println(pair.getKey() + " : " + pair.getValue()); 
	       } */
	       Set set = address.keySet();
	       for(Object obj1:set)
	       {
	    	   System.out.println(address.get(obj1));
	       }
	         
	       JSONArray array = (JSONArray) object.get("Details"); 
	         
	       Set< Map.Entry< String,String> > st = ((Map) array).entrySet();    
	       
	       for (Map.Entry< String,String> map:st) 
	       { 
	           System.out.print(map.getKey()+":"); 
	           System.out.println(map.getValue()); 
	       } 
	   } 
}
