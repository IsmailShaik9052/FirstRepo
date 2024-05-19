package com.var_args_programs;

public class Test {

	public static void main(String[] args)
	{
             
		Var_Args v = new Var_Args();
		v.integer(12);
		v.integer(23,23);
		v.integer(23,23,23,35,54);
		System.out.println("These values from Object method ");
		v.object("summer",23,true,23.5,'c');

	}

}
