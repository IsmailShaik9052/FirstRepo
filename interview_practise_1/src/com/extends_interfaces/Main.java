package com.extends_interfaces;

public class Main 
{

	public static void main(String[] args) 
	{
         /* Here iam using inner class so no need to write implements
          *   class again
          *   Writing inner class means Write the Interface name and provide body
          *   end with semicolan at last;
          *   
          *   Here our interface is Three beacuse this interface extends already 
          *   One and Two interfaces so no need to implement these interfaces
          *   all the methods and variables are valiable in Third interface 
          */
		
		Three t = new Three()  // this is anonimious inner class
		{
			@Override           // here t is one inner class reference variable not interface variable
			public void show()
			{
				System.out.println("This method from One Interface");
			}
			
			@Override
			public void print()
			{
				System.out.println("This method from Two Interface");
			}
			
			@Override
			public void display()
			{
				System.out.println("This method from Three Intereface");
			}
     	};
		
     	t.show();
     	t.print();
     	t.display();
	}

}
