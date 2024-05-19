package com.override_static_method_data_hiding_programs;

public class Main
{
    public static void main(String args[])
    {
    	Super s = new Sub();
    	s.ismail();
    	Sub su = new Sub();
    	su.ismail();
    	
    	/*
    	 * Whenever the super class method and sub class method as a static 
    	 * then the sub class method  is hidden by the super class method
    	 * this is called data hiding in java
    	 * 
    	 */
    }
}
