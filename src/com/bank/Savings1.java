package com.bank;
public class Savings1 implements Bank
{

	private long accNo=5689740;
	
	int pin=900;
	static String [] s;
	String [] s7= {"Name: ","City: ","PAN: "};
	long balance=1000l;
	Savings1(String [] s1 )	
	{
		s=s1;
	}
	Savings1()
	{
	}
	
	public long getAccNo()
	{
		return accNo;
	}
	public void createNewAccount()
	{
		
		System.out.println("Creating savings bank account....");
		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		System.out.println("Account created successfully.");
		System.out.println("A/C Number:  "+accNo);
		System.out.println("PIN:  "+pin);
		accNo++;
		pin++;
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s7[i] + s[i] );
		}
	}
	
	public void getDetails()
	{
		
		System.out.println("A/C Number: "+accNo);
		System.out.println("Balance:  "+balance);
		
	}

	
	public void withdrawl(long l)
	{
		if(l<1000)
			System.out.println("Withdrawl is not possible because of insufficient account balance");
		
	    else if(l>20000)
	    	System.out.println("money exceeded..... transaction failed");
		
		else
		{
			balance=balance-l;
		}
		System.out.println("Balance:  "+balance);
	}
	
	public void deposit(long l1)
	{
		balance=balance+l1;
		System.out.println("Balance:  "+balance);
	}

}

