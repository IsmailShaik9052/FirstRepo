package com.object_class_methods_programs;

public class OverrideEquals 
{
     int id ;
     String name;
     
     public OverrideEquals(int id,String name)
     {
    	 this.id = id;
    	 this.name = name;
     }
     public void display()
     {
    	 System.out.println("id :"+id);
    	 System.out.println("name :"+name);
     }
     @Override
     public boolean equals(Object obj)
     {
    	 OverrideEquals o2 = (OverrideEquals)obj;
    	  if(this.id ==o2.id && this.name.equals(o2.name))
    		   return true;
    		  
    	   return false;
     }
	public static void main(String[] args)
	{
		OverrideEquals o = new OverrideEquals (12,"shaik");
		OverrideEquals o1 = new OverrideEquals(12,"shaik");
		System.out.println(o.equals(o1));
          
	}

}
