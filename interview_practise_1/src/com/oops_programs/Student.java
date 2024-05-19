package com.oops_programs;

public class Student
{
     String studentName;  // these variables are instance variables 
     String studentId;  //   a non-static variable declared outside of the method and declared inside of the class is called instance variable
     // instance variables are created multiple copies for multiple objects 
     
     // static variables are created only one copy for all the objects
     public Student(String studentName, String studentId )// this is parameterized variables declared inside the parameter is called parameter varables )
     { // this is parameterized Constructor to initialize the object properties
    	 this.studentName = studentName;
    	 this.studentId   = studentId;
    	 // when ever out instance variables and parameter variables names are same then we use this key word (this keyword refers current object we can not use this in static context)
     }
     public Student() {};// no-argument constructor 
     // constructor never contain returu type..
     
     
     public static void main(String[] args) 
     {
		 Student s = new Student();   // to access object properties (instance variables we create object of that class with help class name)
         // this is object creation
		 System.out.println(s.studentName);
		 System.out.println(s.studentId);
     }
     
}
