package com.object_class_methods_programs;

public class Test {
    
    @Override
    public String toString()
	{
		return "ismail";   // This method is overriden from object class
	}                      // provide user define values
    @Override
    public int hashCode()
    {
    	return 3;           // This method is overriden from Object class 
    	                    // provide user define values
    }
	public static void main(String[] args) 
	{
		/*
		 * String str = "ismail"; int length =
		 * str.toUpperCase().concat(" shaik ").length(); // this is called method
		 * chaining System.out.println(length);
		 */
		/*
		 * Test t = new Test(); String name = t.getClass().getName();
		 * System.out.println(name); System.out.println(t);
		 * 
		 * String str = "ismail"; name = str.getClass().getName();
		 * System.out.println(name);
		 */
		
		// we are going to @override the object class method 
		
		/*Test t = new Test();
		System.out.println("hash code the object is :"+t.hashCode());
		System.out.println(t);*/
		
		// we are using Object class equals method for checking the address of reference variables
		Test t = new Test();
		Test t1 = new Test();
		Test t2 = t;
		System.err.println(t == t1);
		System.out.println(t2 == t);
		
		System.err.println(t.equals(t1));
		System.out.println(t.equals(t2));
		
		
		
		
	}

}
