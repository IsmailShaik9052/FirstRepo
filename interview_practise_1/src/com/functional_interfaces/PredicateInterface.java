package com.functional_interfaces;
import java.util.function.*;
public class PredicateInterface {

	public static void main(String[] args)
	{
       Predicate<String> p = (obj)->obj.startsWith("s");
       
       System.out.println(p.test("s"));   
       
       // In this code one inner class and lambada function are uses
       Predicate<Integer> i = (x)-> x%2==0;
       
       System.out.println(i.test(12));
       
      
       
       
	}
   /* 
    *  Predicate<T> is a predefined functional interface it has one test() method 
    *  which is taking <T> argument return type is boolean 
    *  
    *  If we want test any single argument value true or flase then we can use 
    *  Predicate<T> Interface ....
    * 
    * 
    */
}

