package com.static_methos_programs;

public class SecondStatic
{
  public static void main(String args[])
  {
	  System.out.println("we are calling form another static method of another class");
	  FirstStatic.myClassStaticMethod();
	  //FirstStatic.myMethod();  this line show the errow can not call from static to non-static
	  
  }
}
