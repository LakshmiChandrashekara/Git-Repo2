package com.bank;

public class Current implements Bank
{
	private long accNo=1789740L;
	int pin=800;
	String [] s;
	String [] s7= {"Name: ","City: ","PAN: "};
	long balance=10000l;
	
	Current(String [] s1 )	
	{
		s=s1;
	}
	Current()
	{}
	
	public long getAccNo()
	{
		return accNo;
	}
	public void createNewAccount()
	{
		
		System.out.println("Creating current bank account....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Account created successfully.");
		System.out.println("A/C Number: "+accNo);
		accNo++;
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s7[i] + s[i] );
		}
		
	}
	
	public void getDetails()
	{
		System.out.println("A/C Number: "+accNo);
		//System.out.println("Name: "+s[0]);
		System.out.println("Balance: "+balance);
	}

	
	public void withdrawl(long l)
	{
		if(l<1000)
			System.out.println("Withdrawl is not possible because of insufficient account balance");
		else
		{
			balance=balance-l;
		}
		System.out.println("Balance: "+balance);
	}
	
	public void deposit(long l1)
	{
		balance=balance+l1;
		System.out.println("Balance: "+balance);
	}
}