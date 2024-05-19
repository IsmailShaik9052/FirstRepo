package com.has_a_relation_programs;

public class Student 
{
 private String studentName;
 private String studentId;
 private College college;
 
public void setCollege(College college) {
	this.college = college;
}

public College getCollege() {
	return college;
}

public Student(String studentName, String studentId, College college) {
	super();
	this.studentName = studentName;
	this.studentId = studentId;
	this.college = college;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentId=" + studentId + ", college=" + college + "]";
}
 
 
 
 
}
