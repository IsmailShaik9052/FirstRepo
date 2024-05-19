package com.interface_runnable_interface;

public class Main 
{
     /* Runnable is the predefined interface available in java.lang.package
      * lang package is default package no need to import this package
      * 
      * This Runnable Interface contain one predefine method called run();
      * public abstract void run();
      * 
      * We are accessing the default interface so no need to take any interface here
      *  
      * We are directly implement that Runnable interface with inner class
      */
	public static void main(String[] args)
	{
       
		Runnable r = new Runnable()
				{
			       public void run()
			       {
			    	   System.out.println("This is Runnable Interface Method .....");
			       }
				};
				
				r.run(); // we accessing here run() method with help of inner class reference variable
	}

}
