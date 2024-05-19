package com.static_polymorphism_programs;

public class MethodOverLoading 
{
	
	// Method overLoading is nothing but same method name but different parametes 
	// if the same parametes available in those methods then it leads ambiguite issue 
	// compiler generates the error duplicate method type method name
	// Advantage of method overloading is code reusabulity method reuasbulity 
	// For suppose we have already addin two numbers method() and we want adding three 
	// the logic for adding 3 number then we can use that method just modify the some logic 
	// and parameters that only ... this is advantage of methodLoading
   public int add(int x , float y)
   {
	   System.out.println("This is integer and float method :"+(x+y));
	   return (int)(x+y);
   }
   
   public int add(int x, int z)
   {
	   //System.out.println("this is integer method :"+(x+y));
	   return x+z;
   }
   
   public static void main(String args[])
   {
	   System.out.println("This is method takes String is a parameter");
	   MethodOverLoading md =  new  MethodOverLoading();   
	   int a =  md.add(12, 12.9f); 
	   System.out.println("converting float to int : "+a);
   }
   
   public static void main(Double x[])  // main method overLoading but always jvms searches for which method take string array is a parameter
   {
	   System.out.println("This is take Double as a parameter ");
	   MethodOverLoading md =  new  MethodOverLoading();   
	   int a =  md.add(12, 12.9f); 
	   System.out.println("converting float to int : "+a);
   }
   
   
}
