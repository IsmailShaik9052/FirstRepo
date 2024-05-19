package default_method;

public class ImplementInncerClass {

	public static void main(String[] args) 
	{
           InnerClass ran = new InnerClass()
        		   { 
        	            @Override
        	             public void run()
        	             {
        	            	 System.out.println("I am Using Inner Class");
        	             }
        	           
        		   };
        		   
        		   InnerClass rum = new InnerClass()
        				   {
        			            public void run()
        			            {
        			            	System.out.println("This is second class method ");
        			            }
        			   
        				   };
        				   
        				   ran.run();ran.zumpak(); rum.run();
              
	}

}
