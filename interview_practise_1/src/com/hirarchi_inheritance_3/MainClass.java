package com.hirarchi_inheritance_3;

public class MainClass
{

	public static void main(String[] args) 
	{
		Employee e = new Employee(1200.00);
		Worker w = new Worker(1000.00);
		System.out.println("Employee salary is :"+e);
		System.out.println("Worker salary is : "+w);

	}
	// inheritance is nothing but code reusabulity 
	// for supose we have one super class as product class
	// in this product class we will take some product name ,price, quantity;
	// Then we take one Electronic product as a sub class this sub class extens this product class 
	// then no need to again write product name , price ,quantity, and what ever the extran properties required then 
	// we should write in this sub class 

}
