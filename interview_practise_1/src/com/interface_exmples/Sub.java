package com.interface_exmples;

public class Sub implements Arthamatic
{
	Integer value1 ;
	Integer value2;
	public void values(Integer value1 , Integer value2)
	{
		this.value1 = value1;
		this.value2 = value2;
	}
	@Override
  public void addition()
  {
	System.out.println("The sum of two number is :"+(value1 + value2));  
  }
	
	@Override
  public void division()
  {
	  System.out.println("The division of two numbers: "+(value1/value2));
  }
	
	@Override
  public void multiplication()
  {
		System.out.println("The multiplication of two number is: "+(value1 * value2));
  }
}
