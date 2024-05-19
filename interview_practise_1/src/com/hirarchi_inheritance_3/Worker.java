package com.hirarchi_inheritance_3;

public class Worker extends Salary
{
   public Worker (Double salary)
   {
	   this.salary = salary;
   }

@Override
public String toString() {
	return "Worker [salary=" + salary + "]";
}
   
   
}
