package com.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudHashSet 
{
	Set<StudentDataBase> set =  new HashSet<>();
	static Scanner sc = new Scanner(System.in);
	
	//methods adds an objects into HashSet type of collection 
	public void addStudent()
	{
		System.out.println("enter the student name");
		String name = sc.next();
		System.out.println("enter the student USN");
		int usn = sc.nextInt();
		System.out.println("enter the student marks");
		float marks = sc.nextFloat();
		StudentDataBase stud = new StudentDataBase(usn,name,marks);
		set.add(stud);
	}
	
	//displays the objects in the HashSet collection
	public void displayObjects()
	{
		Iterator<StudentDataBase> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) 
	{
		StudHashSet studHashSet = new StudHashSet();
		int add=0;
		for(;;)
		{
			System.out.println("1. Add an object	2. Display an object	3. Exit");
		    System.out.println("enter the choice");
			add = sc.nextInt();
		    if(add == 1)
		    	studHashSet.addStudent();
		    else if(add == 2)
		    	studHashSet.displayObjects();
		    else if(add == 3)
		    	break;
		    else 
		    	continue;
  		}
	}

}
