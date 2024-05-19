package com.functional_interfaces;
import java.util.function.Consumer;
public class ConsumereInterface
{

	public static void main(String[] args)
	{
          Consumer<String> c = new Consumer<String>()
        		  {
        	         public void accept(String str)
        	         {
        	        	 System.out.println("My Name Is:"+str);
        	         }
        		  };
        		  c.accept("shaik smile ismail");
        		  
        	/*
        	 *  Consumer<T> is a predefined functional interface available in 
        	 *  java.util.function.Consumer; package  it contain one accept() method
        	 *  return type is void  it does contain any return type 
        	 *  
        	 *  It is uses for taking parameter value
        	 *  
        	 *  With functional Interfaces we can use lambada function 
        	 */	  
        		  
            Consumer<Integer> ci = (num)-> System.out.println("The number is :"+num);
            
            ci.accept(23);
        		  
        		  
  		    Consumer<Student> student = (s)-> 
  		    {
  		    	s.getDetails();
  		    };
  		     System.out.println("**********Student Details***********");
  		     Student stu = new Student("ismail",24);
  		     // Either we can create student object are pass directly object creation
  		     student.accept(new Student("smile",24));
        	 student.accept(stu);	  
        		  
	}

}


class Student
{
	String name ;
	Integer age;
	public Student(String name , Integer age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void getDetails()
	{
		System.out.println("My name is :"+name);
		System.out.println("My age is:"+age);
	}
}
