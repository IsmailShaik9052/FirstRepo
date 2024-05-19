package com.lambada_programs;

interface MyLambada
{
	void run();
}
public class Lambada
{
  public static void main(String[] args)
  {
	  /*
	   * When ever we want to do consise the code in interfaces the we have one
	   * choise use lambada function it is annonymous function with out name
	   * 
	   * When ever we are using lambada it requires one target variable that is a
	   * Interface variable only it not accepts class variables or normal variables
	   * 
	   * Lambada use only with functional interfaces 
	   * 
	   * Functional interface is nothing but if the interface having only one 
	   * abstract method then it is called functional interface it may contain 
	   * static and default methods also no problem
	   * 
	   * If the method contain only one statement the we can remove the flower brackets
	   * also and if the method contain only one variable then we can remove the brackets also
	   * 
	   */
	MyLambada m =  ()->
     {
	      System.out.println("This method is from Interface");
	     
     };
	m.run();
	
	MyLambada m1 = ()-> System.out.println("super ismail");
	
	m1.run();
  }
}
