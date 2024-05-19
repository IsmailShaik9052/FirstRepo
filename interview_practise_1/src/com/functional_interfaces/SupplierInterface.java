package com.functional_interfaces;

import java.util.function.Supplier;

public class SupplierInterface 
{  
	
	/*
	 *  Supplier<T> is predefined interface it contain one get() method it does not take any
	 *  parameter but return type is T  Type parameter   
	 * 
	 * 
	 */

	public static void main(String[] args) 
	{
      Supplier<Integer> s = new Supplier<Integer>()
    		  {
    	         @Override
    	         public Integer get()
    	         {
    	        	 return 235;
    	         }
    		  };
    		  
    		  System.out.println(s.get());
    		  
    		  
        Supplier<Student> st = ()->   new Student("shaik",25);
        
                    Student stu = st.get();
                    stu.getDetails();
	}

}
