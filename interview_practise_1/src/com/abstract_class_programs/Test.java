package com.abstract_class_programs;

public abstract class Test 
{
     /*
      *  Abstract class means which class does not provide the complete implementation
      *  of the class provide partial implementation is called abstract class
      *  
      *  We can easily find out the abstract method beacuse the  method contain 
      *  abstract key word so and it does not provide the body also it will end 
      *  with semicolan ;..
      *  
      *  We are declaring the abstract method in super class level and what ever the
      *  sub class are extends the super class  those classes must implement that method
      *  other wise which class does not implemented abstract method that class became
      *  Abstract classs so we can not create Object for that also ..
      *  
      *  For Supose we have two abstract methods if one sub class extends the super
      *  class and provide the implementation for one method only then that class also 
      *  became abstract class so another class provide implementation for only one method
      *  already one sub class provid the implementation for one method..
      *  
      *  We can not create the Object for Abstract class we can use the reference variable
      *  
      *  Abstract class may or may not contain Abstract method 
      *  
      *  If any class have abstract method then the class became abstract class
      *  
      *  Mainly we use Abstract class or method if the what ever we are going to
      *  develop the project If the action is same but implementation is different
      *  then we use abstract method or class
      *  
      *  The advantage is method recognization is less once we declare one abstract 
      *  method  we must implement that method so what ever logic we need in our
      *  Sub class we can write inside that Override method that method from super class
      *  
      *  We can declare normal methods and Constructors also inside Abstract Class
      *  
      *  We can declare variables also like how we declared in normal class like 
      * 
      */
	
	public abstract void play();
	 
	
	
}


