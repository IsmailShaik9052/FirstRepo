package com.abstract_class_programs;

public class Sub extends Test
{
	 @Override
   public void play()
   {
	   /* here providing the implementation 
	   of abstract method which is available in Test class
	   
	   * if this does not provide the implementation of this method then
	   * this class became abstract class so this class does not contain object creation
	   *
	   */
	   
	   System.out.println("This is sub class method");
	   
	   // Here you should write what ever logic you need that logic as per 
	   // your requirement..
	   
   }
   
   public static void main(String args[])
   {
	   Test t = new Sub();  // here using upcasting concept
	   t.play();
   }
   
   
   
   
   
}
