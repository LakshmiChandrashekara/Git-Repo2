package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main 
{
	static Scanner scanner = new Scanner(System.in);
	Employee emp1 = new Employee("Ranjith",100,10000,"QA Engg");
	Employee emp2 = new Employee("Shantha",101,15000,"Dev");
	Employee emp3 = new Employee("Lavanya",102,20000,"QA Engg");
	Employee emp4 = new Employee("Srini",103,10000,"Analyst");
	Employee emp5 = new Employee("Ganesh",104,40000,"Manager");
	Employee emp6 = new Employee("Sai",105,30000,"Asst Dev");
	Employee emp7 = new Employee("Chandu",105,30000,"Asst Dev");
	
	
	//Method to add objects into ArrayList
	public void arrayList(List<Employee> list)
	{
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		System.out.println("Objects of ArrayList");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	//Method to add objects into LinkedList
	public void linkList(List<Employee> list)
	{
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		System.out.println("Objects of LinkedList");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println("enter the choice:");
		System.out.println("1. Delete an object 2. Add an object ");
		int choice = scanner.nextInt();
		if(choice==1)
			deleteListObject(list);
		else 
			addListObject(list);
				
	}
	
	//Method to delete an object from the LinkedList
	public void deleteListObject(List<Employee> list1)
	{
		list1.remove(emp2);
		System.out.println();
		System.out.println("after removing");
		for(Employee e:list1)
		{
			System.out.println(e);
		}
	}
	
	//Method to add an object to the LinkedList
	public void addListObject(List<Employee> list2)
	{
		list2.add(emp7);
		System.out.println();
		System.out.println("after adding");
		for(Employee e:list2)
		{
			System.out.println(e);
		}
	}
	
	//Method to add objects into vector
	public void vector(List<Employee> list)
	{
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		System.out.println("Objects of Vector");
		Enumeration<Employee> enumeration = Collections.enumeration(list);
		while (enumeration.hasMoreElements()) 
			System.out.println(enumeration.nextElement()); 
	}
	
	public static void main(String[] args) 
	{
		Main main =  new Main();
		System.out.println("Enter the choice:");
		System.out.println("1. ArrayList  2. LinkedList  3. Vector");
		int choice=scanner.nextInt();
		switch(choice)
		{
			case 1: main.arrayList(new ArrayList<>());
					break;

			case 2: main.linkList(new LinkedList<>());
					break;

			case 3: main.vector(new Vector<>());
					break;

		    default: main.linkList(new LinkedList<>());
		    		 System.out.println("invalid choice");
		    		 break;

		}
		
	}
}
