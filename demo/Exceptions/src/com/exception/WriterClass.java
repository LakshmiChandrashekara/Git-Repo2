package com.exception;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterClass 
{
	static int data;
	boolean res;
	String path;
	WriterClass(String path)
	{
		this.path=path;
		
	} 
	public static boolean isInt(String s)
	{
		try {
				data=Integer.parseInt(s);
				return true;
			}catch(NumberFormatException e)
			{
				
				return false;
			}
			
		

	}
	public void doWrite(String data1) throws CustomExceptionClass
	{
		File f = new File(String.valueOf(path));
		FileWriter fw = null;
		try {
				fw = new FileWriter(f);
				res=WriterClass.isInt(data1);
				if(res)
				{
					fw.write(String.valueOf(data));
					
					System.out.println("data is written successfully...");

				}	
				else
				{
					throw new CustomExceptionClass();
				}	
			}catch (IOException e)
			{
					e.printStackTrace();
			}finally
			{
				try {
					fw.flush();
					fw.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
				
			}
	 }
}
