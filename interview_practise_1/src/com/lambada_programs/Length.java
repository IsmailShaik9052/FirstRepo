package com.lambada_programs;

public interface Length 
{
  public abstract void length(String str);
}

class Main
{
	public static void main(String args[])
	{
		// This is a implementer class and that to it is a lambada function
		Length l =  (val)-> System.out.println("The length of the name is: "+val.length());
		
		l.length("shaik ismail");
		
	}
}