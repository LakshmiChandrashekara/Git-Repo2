package com.sets;

public class StudentDataBase implements Comparable
{
	int usn;
	String studName;
	float studMarks;
	
	StudentDataBase(int usn,String studName,float studMarks)
	{
		this.usn=usn;
		this.studName=studName;
		this.studMarks=studMarks;
	}
	
	//overridden toString method to return states of the StudentDataBase class
	public String toString()
	{
		return this.usn+" "+this.studName+" "+this.studMarks;
	}
	
	//overridden hashCode method to return the Student USN state  
	public int hashCode()
	{
		return this.usn;
	}
	
	//overridden equals method to check the uniqueness of the objects 
	public boolean equals(Object obj)
	{
		StudentDataBase student = (StudentDataBase)obj;
		return student.usn == this.hashCode();
	}

	//overridden compareTo method to sort the objects in descending order based on student USN
	public int compareTo(Object obj) 
	{
		StudentDataBase student = (StudentDataBase)obj;
		return student.usn-this.usn;
	}

}
