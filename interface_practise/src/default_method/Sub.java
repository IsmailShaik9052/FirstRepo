package default_method;

import java.util.Scanner;
	
	public class Sub 
	{
		
	public static void main(String[] args) 
	 {
		Super sub = new Super()
				{
			      public void sum()
			      {
			    	  
			    	  System.out.println("Hi this from Anynomous class...");
			      }
			      
			      public void sum1()
			      {
			    	  Scanner s = new Scanner(System.in);
			    	  System.out.println("Etne the name: ");
			    	  String name = s.nextLine();
			    	  System.out.println("Enter the another name:  ");
			    	  String name1 = s.nextLine();
			    	  System.out.println(name+name1);
			      }
			
				};
				
				sub.sum();
				sub.sum1();
		
		
	}

	

}
