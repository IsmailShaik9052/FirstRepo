package com.interface_default_method_added;

public class Main 
  {
    // I am going to implement Interface through annomyous inner classes
	public static void main(String[] args) 
	{
		
		 Vehicle car = new Vehicle()
		{
              @Override
			 public void horn()
			 {
				 System.out.println("Car has horn");
			 }
			 @Override
			 public void digitalMeter()
			 {
				 System.out.println("car has digital meter");
			 }
	    };
	    
	    
		Vehicle bike = new Vehicle()
		{
			  @Override
		      public void horn()
		      {
		    	  System.out.println("Bike has horn");
		      }
		};
		car.horn();
		car.digitalMeter();
		bike.horn();

	}

}
