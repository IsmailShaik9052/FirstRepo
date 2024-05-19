package com.multilevel_inheritence_programs_2;

public class First 
{
   public String myName;
   public Integer myAge;
   public Integer myRank;
   public void setDetails(String myName,Integer myAge)
   {
	   this.myName = myName;
	   this.myAge  = myAge;
   }
   
   public void getDetails1()
   {
	   System.out.println("my name is :"+myName);
	   System.out.println("my age is :"+myAge);
	   System.out.println("myRank is :"+myRank);
   }
}
