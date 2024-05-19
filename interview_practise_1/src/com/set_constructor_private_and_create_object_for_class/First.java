package com.set_constructor_private_and_create_object_for_class;

public class First 
{
  private static First instance;
  private First() {}; // here constructor is private so we can not creat  the object for this class
  private String userName;
  private Integer userId;
  
  public static First getInstantiation()
  {
	  if(instance == null)
		 instance = new First();
	     return  instance;  // with the help of this method we can create the object for this class
  }
  
  public void setUserName(String userName)
  {
	  this.userName = userName;
  }
  public String getUserName()
  {
	  return userName;
  }
  public void setUserId(Integer userId)
  {
	  this.userId = userId;
  }
  
  public Integer getUserId()
  {
	  return userId;
  }
}
