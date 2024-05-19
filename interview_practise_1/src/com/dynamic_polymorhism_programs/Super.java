package com.dynamic_polymorhism_programs;

public class Super 
{
	/* 
	 what ever the method available in super class these methods available in 
	 sub class then the method signature is same then it is called 
	 method overriding concept 
	 
	 Then  we can stored the sub class object to the super class object reference 
	 variable  when ever we run the program then the compiler first check the super class
	 methods and then check the methods are available in sub class or not if the 
	 methods are available then sub class methods are executed if the methods of 
	 sub class not follow the method signature then super class methods will execute
	 this concept called upcasting in java....
	 
	  Advantage of method overriding in java is 
	  Each class specifing it's own specific behaviour
	*/
     public void addition(int value1 , int value2)
     {
    	 int sum = value1+ value2;
    	 System.out.println("From super Class the sum of two numbers is: "+sum);
     }
     
     public void subtraction(int value1 , int value2)
     {
    	 System.out.println("This is form super calss(subtraction): "+(value1-value2));
     }
}
