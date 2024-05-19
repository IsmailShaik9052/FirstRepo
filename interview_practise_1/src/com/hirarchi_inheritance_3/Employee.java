package com.hirarchi_inheritance_3;

public class Employee extends Salary 
{
	public Employee(Double salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}

	
}
