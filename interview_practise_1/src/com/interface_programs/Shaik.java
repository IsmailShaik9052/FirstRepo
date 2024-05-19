package com.interface_programs;

public interface Shaik 
{
   /*
    * what ever methods we write inside the interface those methods are by default
    * public and abstract methods
    * 
    * we can not write interface inside any concreate methods as well as any block
    * also like static and instance ,constructor 
    * 
    * what ever the variables we declare inside the interface those variables 
    * are by default public + static + fianl ; 
    * 
    * We can call the variable with the help of interface name because variable is static and final so
    * 
    * We can not create the object for interface beacuse it contains abstract methods
    * 
    * Java 1.7 onwords we can write only abstract methods inside the interface
    * but java 1.8 onwords  we can write the  default and static methods
    * 
    * To provide the implementation of interface java people provide implements keyword
    * with the help of implements keyword we are provide implementaion for abstract methods
    * 
    *  The sub class must provide the implementation of abstract method other wise
    *  the sub class bacame abstract class hence object can not created.
    *
    * 
    *  By using interface we can acchieve multiple inheritance....
    * 
    * 
    */
	
	
	public abstract void sports();
	int players = 11;
	
	
	
}
