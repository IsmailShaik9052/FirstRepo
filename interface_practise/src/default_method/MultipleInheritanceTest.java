package default_method;

import java.util.Scanner;

interface MultipleInheritance 
{
    abstract void sum();
}

interface MultipleInheritance1 
{
	abstract void sum();
}
public class MultipleInheritanceTest implements MultipleInheritance ,MultipleInheritance1
{
	
	 @Override
		public void sum()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num = input.nextInt();
			System.out.println("Enter the second number: ");
			int num1 = input.nextInt();
			System.out.println("Sum of Two numbers: "+(num1+num));
			input.close();
		}

	public static void main(String[] args) 
	{
		
		MultipleInheritanceTest t = new MultipleInheritanceTest();
		
		t.sum();

	}

}
