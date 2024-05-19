package com.multilevel_inheritence_programs_2;

public class Second extends First
{
  public String myCollegeName;
  public String myCollegeAddress;
  public Integer myRank;
  // This class contain First class properties also 
  // if any property of First class name is same to the second class property
  // then second class give more importance it own property 
  // if we want to initialize the First Class property then we have to use 
  // super key word instead  of this key word. super key word refers to the super class properties
 
    
  public void setDetails(String myCollegeName, String myCollegeAddress,Integer myRank)
  {
	  this.myCollegeName = myCollegeName;
	  this.myCollegeAddress = myCollegeAddress;
	  super.myRank = myRank;
  }
      
  public void getDetails()
  {
	  //super.getDetails();
	  System.out.println("my college Name :"+myCollegeName);
	  System.out.println("my college Address :"+myCollegeAddress);
	  System.out.println("My first Rank is: "+super.myRank);
	  System.out.println("my Second Rank is :"+this.myRank);
	  
	 /* In this class two getDetails() methods are available one method is from First class method 
	  * Another method is from this Second class method   
	 */
  }
}
