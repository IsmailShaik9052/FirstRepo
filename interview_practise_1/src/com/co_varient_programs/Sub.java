package com.co_varient_programs;

public class Sub extends Base
{
	/*
	 *  If we want accehieve Co-varient concept then the super class methods and sub class methods 
	 *  must in inheritance relationship if the methods are not in inheritance relationship then 
	 *  we can not change the return of those methos we will get compile time error
	 *  
	 *   Inheritance relationship means  super Class methods return type is 
	 *   any one super class like Number is a super class of numeric types class
	 *   ex:- like Integer , Float , Long , Double, Byte Like this..
	 *   
	 *   Must the methods in inheritance relationship then we will change the return type 
	 */
    public Integer show()
    {
    	System.out.println("hi ismail ");
    	return 78;
    }
    
}
