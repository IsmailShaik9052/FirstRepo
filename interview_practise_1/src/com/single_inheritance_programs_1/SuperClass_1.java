package com.single_inheritance_programs_1;

public class SuperClass_1 
{
     Integer studentId ;
     String  studentName;
     
     
		/*
		 * @Override public String toString() 
		 * { 
		 * 
		 * return "SuperClass_1 [studentId=" +studentId + ", studentName=" + studentName + "]";
		 * 
		 * }
		 */
     
		
		  public SuperClass_1(Integer studentId, String studentName)
		  { 
			  this.studentId   = studentId;
			  this.studentName = studentName; 
		  }
		  
		  public void getDetails()
		  {
			  System.out.println(studentName +""+studentId);
		  }
		 
}
