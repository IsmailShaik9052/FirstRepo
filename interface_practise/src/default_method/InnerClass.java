package default_method;

import java.util.Scanner;

public interface InnerClass 
{
  public abstract void run();
  public default void  zumpak()
  {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the value of the number: ");
	  int number = input.nextInt();
	  System.out.println("Enter the second number value: ");
	  int number2 = input.nextInt();
	  System.out.println(number+number2);
	  input.close();
	  System.out.println("This is a default method ..if we want then we can override otherwise ignore it no problem");
  }
}
