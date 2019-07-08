package com.json;

public class Student 
{
	String name;
	transient int USN;
	float marks;
	String phNumber=null;
	Student(String name,int USN,float marks)
	{
		this.name=name;
		this.USN=USN;
		this.marks= marks;
	}

	public String toString() 
	{
		return this.name+" "+this.USN+" "+this.marks+" "+this.phNumber;
				
	}
	
	

}
