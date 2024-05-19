package com.interface_static_methods;

public interface LastName 
{
   public abstract void name();
   
   
   /* Static method is used to provide the common implementation for all the
    * implementation classes  java 8 onwords we can declare static methods in 
    * interfaces as well as default methods also
    * 
    * We can not override the static methods so with the help of interface name
    * we can acchieve the static method 
    * 
    * 
    **/
   static void lastName()
   {
	   System.out.print(" shaik");
   }
}
