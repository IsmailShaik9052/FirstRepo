package com.interface_static_methods;

public class Main 
{

	public static void main(String[] args) 
	{
         
		LastName ln = new LastName()
	     {
			 public void name()
			 {
				 System.out.print("ismail");
			 }
		 };
		
		ln.name();
		LastName.lastName();
		
		
	}

}
