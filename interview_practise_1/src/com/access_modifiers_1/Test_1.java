package com.access_modifiers_1;

import com.access_modifiers_programs.Test;

public class Test_1 extends Test
{
  protected String myName;
  
  public Test_1(String name,Integer age,String myName)
  {
	  super(name,age);
	  this.myName = myName;
  }

@Override
public String toString() {
	return "Test_1 [myName=" + myName + ", name=" + name + ", age=" + age + "]";
}
  
  
  
  
}
