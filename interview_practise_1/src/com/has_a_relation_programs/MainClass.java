package com.has_a_relation_programs;

public class MainClass {

	public static void main(String[] args) 
	{
        College clg = new College("osmania","kurnool");
        Student std = new Student("ismail","4182100",clg);
        System.out.println(std);
	}

}
