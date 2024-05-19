package com.single_inheritance_programs_1;

public class SubClass_1 extends SuperClass_1
{
  /*
   *  These Below properties are SuperClass_1 properties
   *  
   *  Integer studentId ;
   *  String studentName;
   *  
   *  These properties are available defaultly in this sub class beacuse we extends the super class
   * 
   *  If we declare the constructor in super class then we pass the values from sub class constructor to super class constructor wiht the help of supe keyword 
   * 
   *  We can print the values of super class and sub class with the help of sub class object no need to create the super class object 
   *  
   *  If we have @toString method in both superClass and subClass then if we print the object reference of subClass 
   *  then we will get sub Class @toString method values only we won't get super class toString method values 
   *  
   *  If we declare the toString method only in super class then we will get only super class toString values with the help of subClass object reference 
   * */
  String collegeName;
  String collegeAddress;
  public SubClass_1(String collegeName , String collegeAddress,String studentName,Integer studentId)
  {
	  super(studentId, studentName);
	  this.collegeName = collegeName;
	  this.collegeAddress = collegeAddress;
  }
  public void method()
  {
	  System.out.println("sub class method");
  }
//@Override
	/*public String toString() // this toString has both superClass and subClass properties
	{
	 return "SubClass_1 [collegeName=" + collegeName + ", "
	 + "collegeAddress=" + collegeAddress + ", studentId=" + studentId
		+ ", studentName=" + studentName +"]";
		
	}*/
  
	/*
	 * public void showData() 
	 * { 
	 * System.out.println(studentId);
	 * System.out.println(studentName); 
	 * System.out.println(collegeName);
	 * System.out.println(collegeAddress);
	 * }
	 */

  /*@Override  // this toString method have only sub Class properties 
public String toString() 
{
	return "SubClass_1 [collegeName=" + collegeName + ", collegeAddress=" + collegeAddress + "]";
}*/
  
  
  
}
