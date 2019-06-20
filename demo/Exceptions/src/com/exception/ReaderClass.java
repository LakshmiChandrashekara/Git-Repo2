package com.exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReaderClass
{
	FileReader fr=null;
	String path;
	int i;
	ReaderClass(String path)
	{
		this.path = path;
	}	
	public void doRead()
	{
		
		try {
			fr = new FileReader(path);
			}catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try {
			
			String s=String.valueOf(fr.read());
			System.out.println(s);
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				
			}
		}
		
		
	}
	
}
