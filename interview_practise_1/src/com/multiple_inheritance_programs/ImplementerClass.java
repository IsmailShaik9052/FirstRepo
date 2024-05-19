package com.multiple_inheritance_programs;

public class ImplementerClass implements First,Second
{

	@Override
	public void sum() 
	{
		 int x , y ;
		 x = 10; y= 20;
		 System.out.println("The sum of two numbers is:"+(x+y));
	}

}
