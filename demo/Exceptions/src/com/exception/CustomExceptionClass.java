package com.exception;

public class CustomExceptionClass extends Exception
{
	CustomExceptionClass()
	{
		System.out.println("invalid data....");
		System.out.println("only numeric type of data is allowed inside the file");
		System.out.println();
	}

}
