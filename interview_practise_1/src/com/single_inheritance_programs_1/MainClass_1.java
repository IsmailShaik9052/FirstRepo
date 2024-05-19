package com.single_inheritance_programs_1;

public class MainClass_1 
{

	public static void main(String[] args)
	{
		
		SubClass_1 su = new SubClass_1("osmania","kurnool","ismail",121);
		su.getDetails();
		su.method();
		// we can not create SuperClass_1 su = new SubClass_1(values);
		// In inheritance polymorphism is not working (upcasting is not working )
		// we can not assign sub class object to super class reference variable in inheritance concepts

	}

}
