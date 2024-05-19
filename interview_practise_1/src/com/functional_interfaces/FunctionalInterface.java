package com.functional_interfaces;
import java.util.function.Function;
public class FunctionalInterface 
{

	public static void main(String[] args) 
	{ 
		
		/* 
		 * Function<T,R> is predefined interface it contain apply() method
		 * This interface desides the return type and Type of value 
		 * 
		 * 
		 * 
		 */
		
        Function<String,Integer> fn = new Function<String,Integer>()
        		{
        	         public Integer apply(String str)
        	         {
        	        	 return str.length();
        	         }
        		};
        		
        		System.out.println(fn.apply("shaik ismail"));
        		
        		
        		
        		 Function<Student,Student> fun = (Student str)-> 
        		 {
        			 str.getDetails();
					  return new Student("23",23);
        		 };
        	  
        		 System.out.println(fun.apply(new Student("shaik",23)));
        			 
        		
        		
        		
        		
        		
        		
        		
        		
        		
	}

}
