package default_method;

	public interface Super 
	{
	  public abstract void sum();
	  
	  default void sum1()
	  {
		  System.out.println("Iam trying to implement some newly.....");
	  }
	}
