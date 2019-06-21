package my_maven_project;
/**
 * Java program to Convert a String to a Character array using Naive Approach 
 * @author Lakshmi.RC
 * version 1.0
 *
 */
public class StringToCharArray 
{
	public static void main(String args[]) 
    { 
        String str = "collections"; 
  
        /** Creating array of string length 
         * 
         */
        char[] ch = new char[str.length()]; 
  
        /** Copy character by character into array
         *  
         */
        for (int i = 0; i < str.length(); i++) 
        { 
            ch[i] = str.charAt(i); 
        } 
  
        /**
         *  Printing content of array 
         */
        for (char c : ch) 
        { 
            System.out.println(c); 
        } 
    } 
}
