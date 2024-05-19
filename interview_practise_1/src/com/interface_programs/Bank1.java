package com.interface_programs;

public interface Bank1 
{
	void deposite(double amount);
	void withdraw(double amount);
}

class SBI implements Bank1
{
	double amount = 10000;
	@Override
	public void deposite(double amount)
	{
		
		this.amount =this.amount + amount;
		System.out.println(this.amount);
	}
	
	@Override
	public void withdraw(double amount)
	{
		this.amount = this.amount - amount;
		System.out.println("After withdraw amount is : "+this.amount);
	}
	
	
	
 }
	

class Main
{
	public static void main(String args[])
	{
		SBI b = new SBI();
		
		b.deposite(300);
		b.withdraw(1200);
		
	   
	}
}