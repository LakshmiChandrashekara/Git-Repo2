package com.sets;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudTreeSet 
{
	static StudTreeSet studTreeSet = new  StudTreeSet();
	TreeComparator treeComparator = new TreeComparator();
	Set<StudentDataBase> set =  new TreeSet<>();
	Set<StudentDataBase> setTree =  new TreeSet<>(treeComparator);
	static Scanner sc = new Scanner(System.in);
	
	//methods adds an objects into TreeSet type of collection 
	public void addStudentTreeSet()
	{
		System.out.println("enter the student name");
		String name = sc.next();
		System.out.println("enter the student USN");
		int usn = sc.nextInt();
		System.out.println("enter the student marks");
		float marks = sc.nextFloat();
		StudentDataBase stud = new StudentDataBase(usn,name,marks);
		setTree.add(stud);
	}
	
	//methods adds an objects into TreeSet type of collection 
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
	
	//displays the objects in the TreeSet collection
	public void displayObjects()
	{
		Iterator<StudentDataBase> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void displayNameSortedObjects()
	{
		Iterator<StudentDataBase> iterator = setTree.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void addSortObjects()
	{
		for(;;) 
		{
		System.out.println("1. Add an object 2. Display an objects 3. Exit");
    	int choice = sc.nextInt();
    	if(choice==1)
    		studTreeSet.addStudentTreeSet();
    	else if(choice==2)
    		studTreeSet.displayNameSortedObjects();
    	else if(choice==3)
    		  break;
    	else
    		continue;
		}
	}
	public static void main(String[] args) 
	{
		int add=0;
		for(;;)
		{
			System.out.println("1. Add an object	2. Display an object	 3. Display the objects sorted based on student names	4. Exit");
		    System.out.println("enter the choice");
			add = sc.nextInt();
		    if(add == 1)
		    	studTreeSet.addStudent();
		    else if(add == 2)
		    	studTreeSet.displayObjects();
		    else if(add == 3)
		    	studTreeSet.addSortObjects();
		    else if (add == 4)
		    	break;
		    else 
		    	continue;
  		}
	}

}
