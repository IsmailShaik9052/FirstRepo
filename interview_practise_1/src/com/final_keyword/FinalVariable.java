package com.final_keyword;

public class FinalVariable 
{
	final int number ;
	public FinalVariable(int number)
	{
		this.number = number; // we can initialize the final variable with help of constructor
		System.out.println(number);
	}
	public static void main(String[] args) 
	{
		new FinalVariable(23);
		// number = 20;  we can not reassign the value to the final variable again 
		// we must initialize the variable only once
		// we can declare the variable and assign the value after also
	}

}
