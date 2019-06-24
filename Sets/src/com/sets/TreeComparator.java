package com.sets;

import java.util.Comparator;
public class TreeComparator implements Comparator<StudentDataBase>
{
	public int compare(StudentDataBase student1, StudentDataBase student2) 
	{
		return student1.studName.compareTo(student2.studName);
	}
}
