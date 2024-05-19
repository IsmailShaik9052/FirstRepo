package com.has_a_relation_programs;

public class College
{
 private String collegeName;
 private String collegAddress;
 
public College(String collegeName, String collegAddress) {
	super();
	this.collegeName =   collegeName;
	this.collegAddress = collegAddress;  // to initialize object properties
}
public String getCollegeName() {
	return collegeName;                // to get the data from outSide of the class these methods
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getCollegAddress() {
	return collegAddress;
}
public void setCollegAddress(String collegAddress) {
	this.collegAddress = collegAddress;
}
@Override
public String toString() {
	return "College [collegeName=" + collegeName + ", collegAddress=" + collegAddress + "]";
}
 
 
}
