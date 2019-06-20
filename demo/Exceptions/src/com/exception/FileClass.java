package com.exception;

import java.io.File;
import java.io.IOException;


public class FileClass
{
	String path=null;
	FileClass(String path)
	{
		this.path=path;
	}
	public void createFile() throws IOException 
	{
		File f=new File(path);
		f.createNewFile();
		System.out.println("file is created successfully...");
	}
}
