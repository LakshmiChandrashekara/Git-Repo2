package com.bank;

import java.util.Scanner;

public class Manager 
{
	static int pin;
	static Bank b=null;
	int choice;
	
	public void create(char type)
	{
		if(type=='s' || type=='S')  
		{	
			b=new Savings1(s2); 
			b.createNewAccount();
		}
		else if(type=='c' || type=='C')
		{ 
			b=new Current(s2);
			b.createNewAccount();
		}

	}
	public void details(Bank b1)
	{
		System.out.println("enter the options   1. check balance  2. withdrawl  3. deposit ");
		System.out.println("enter the choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1 : b1.getDetails();
					break;
					
		case 2 : System.out.println("enter the amount:");
				 long l=sc.nextLong();
				 b1.withdrawl(l);
				 break;
				 
		case 3 : System.out.println("enter the amount:");
				 long l1=sc.nextLong();
		         b1.deposit(l1);
		         break;
		
		default : System.out.println("invalid option");
					break;
		}
	}

	static String [] s2= {"0","0","0"};
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Manager m=new Manager();
		char c=0;
		
		 
		System.out.println("Welcome to online banking portal");
		System.out.println("Enter the option");
		
		System.out.println("1. Create a new account");
		System.out.println("2. Check details");
		int num=sc.nextInt();
		switch(num)
		{
			case 1 : System.out.println("enter the account type");
				 	 String s=sc.next();
				     c=s.charAt(0);
				     System.out.println("Enter the user name,address,pan");
				     for(int i=0;i<3;i++)
				     {
					     s2[i]=sc.next();
				     }
				     m.create(c);
				     break;
				
		   case 2 :  System.out.println("Enter the PIN"); 
				     pin=sc.nextInt();
				     if(pin==900)
					     m.details(new Savings1());
				     else if(pin==800)
				         m.details(new Current());
				     break;
				
		   default : System.out.println("invalid option");
					  break;
		}
		
	}
	
		
}