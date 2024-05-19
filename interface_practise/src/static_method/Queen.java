package static_method;

import java.util.Scanner;

public class Queen
    {

	public static void main(String[] args) 
	{
		King kon = new King ()
				{
			      public void square()
			      {
			    	  Scanner s = new Scanner(System.in);
			    	  System.out.println("Enter the number: ");
			    	  int num = s.nextInt();
			    	  System.out.println("Enter the secondnumber: ");
			    	  int num1 = s.nextInt();
			    	  if(num <=0 || num1 <=0)
			    	  {
			    		  System.out.println("Eneter only positive numbers");
			    	  }
			    	  else
			    	  {
			    		  System.out.println("The square of two numbers is :"+(num*num1));
			    	  }
			      }

				
			    
				};
				
				kon.square();
				King.sum1(); 
				
				King quee = new King()
				{
					@Override
					public void square()
					
			        {
						
					  Scanner s = new Scanner(System.in);
			    	  System.out.print("Enter the number: ");
			    	  int num = s.nextInt();
			    	  System.out.print("Enter the secondnumber: ");
			    	  int num1 = s.nextInt();
			    	  if(num <=0 || num1 <=0)
			    	  {
			    		  System.out.println("Eneter only positive numbers");
			    	  }
			    	  else
			    	  {
			    		  System.out.println("The square of two numbers is :"+(num*num1));
			    	  }
			        }

					

				};
				
				quee.square();
				King.sum1(); 

	}

}
