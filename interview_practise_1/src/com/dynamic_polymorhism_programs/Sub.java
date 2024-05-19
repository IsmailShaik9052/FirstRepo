package com.dynamic_polymorhism_programs;

public class Sub extends Super
{
	/*
	 * We are writing the @Override annotation becuase we are giving the conformation 
	 * to the compiler as well as to the user also this method is override method from 
	 * super calsss...
	 * */
	@Override  
	public void addition(int value1 , int value2)
	{
		int sum = value1+value2;
		System.out.println("From sub Class the sum of two numbers is :"+sum);
	}
	@Override
	public void subtraction(int value1 , int value2)
	{
		System.out.println("This is from sub class(subtraction):"+(value1-value2));
	}

}
