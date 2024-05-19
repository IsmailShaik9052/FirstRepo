package com.multilevel_inheritence_programs_2;

public class Third extends Second
{
	/*
	 *  In this class First class methods and Second class methods also this class metods are available
	 *  This class extends from second class and second class extends from First class 
	 *  Whenever we create Third class object with this object reference variable
	 *  We can access all the properties and methods are available in Third class
	 *  If is there any Same name metods and properties  then each class give the importance with their properties and methods
	 *  We must use super key word to call the super super class properties and methods
	 * */
  public void myDetails()
  {
	  System.out.println("These are my Details");
  }
}
