package com.enum_programs;

public enum EnumClass 
{
    SUMMER,WINTER,RAINY,SUN,MOON;
	/*
	 * Enum is class in java and it is a keyword also we can write enum in side
	 * class and outside the class and inside the method also 
	 * 
	 * We can write enum inside main method() also but the enum constants must end
	 * with semicolans otherwise we will get error
	 * 
	 * By default every enum constant is a public + static + final 
	 * 
	 * By default every enum constant is a Object so we can write Constructor
	 * and method also inside the enum 
	 * 
	 * To print the constant values  enum keywrod provide one method  called
	 * values() with this method help we can print the constant values of enum
	 * the method return type is array of Enum type[]
	 * 
	 * If we want to know the index positions of constants then the Enum class
	 * called Class provided one method called ordinal() with this method help 
	 * we can print the index values of costants..
	 * 
	 * We can pass the values with the Constants because the constants are objects
	 * the values took the parameter Constructor 
	 * 
	 * We can pass the reference variable in switch  case also
	 * 
	 */
}

 class MyClass
 {
	 enum MyEnum
	  {
		  sunday("mo"),monday,tuesday,wednesday,thursday,friday,saturday;
		  String val;
		  MyEnum(String st)
		  {
			 val  = st; 
			 System.out.println("This value form constructor"+val);
		  }
		  
		  MyEnum()
		  {
			  
		  }
	  }
	   public static void main(String args[])
	   {
		     
		   
		      for(EnumClass d : EnumClass.values())
		      {
		    	  System.out.print(d+" ");
		    	  System.out.println(d);
		      }
		      
		      MyEnum[] values = MyEnum.values();
		      for(int i = 0; i < values.length ; i++)
		      {
		    	  System.out.println(values[i]);
		    	 
		      }
	   }
 }