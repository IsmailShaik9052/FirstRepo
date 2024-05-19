package com.set_constructor_private_and_create_object_for_class;

public class MainFirst {

	public static void main(String[] args)
	{
		
	// First f = new First();  // we can not create object for this class because this class constructor is private
	
		First object = First.getInstantiation();
		object.setUserId(121);
	    object.setUserName("shiak");
		System.out.println(object.getUserName());
		System.out.println(object.getUserId());
		First second = First.getInstantiation();
		second.setUserName("smile");
		second.setUserId(131);
		System.out.println(second.getUserName());
		System.out.println(object.hashCode());
		System.out.println(second.hashCode());
		

	}

}
