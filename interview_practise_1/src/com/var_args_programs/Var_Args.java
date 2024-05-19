package com.var_args_programs;

public class Var_Args
{
	/*
	 * var args is nothing but variable argument & array variable it can access 
	 * the 0 to n number of values of same type of different type with the help 
	 * of Object class
	 *  
	 *  It is important only one var args in one method that to last argument variable 
	 *  
	 *  If we can write two var args in one method the compiler gives the error 
	 *  only one var arge that to last argument
	 *  
	 *  
	 * 
	 * 
	 * */
	
	
	/*
	 * public void doubt(int ...x , int ...y) 
	 * {
	 *   This method gives the error we can not define two var args variables in one method
	 * }
	 */
   public void integer(int x ,int ...var )
   {
	   System.out.println(x); // This method takes only integer values 
	   for(int a : var)
	   {
		   System.out.println(a);
	   }
	  
   }
   
   
   public void object(Object ...var)
   {
	   for(Object obj :var)  // This method can access any type of values beacause Argument is Object Class
	   {
		   System.out.println(obj);
	   }
   }
   
   
   
   
   
}
