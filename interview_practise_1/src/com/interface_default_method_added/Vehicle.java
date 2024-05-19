package com.interface_default_method_added;

public interface Vehicle
{
    public abstract void horn();
    
    /* This defalut method declare inside the interface because provide the
     * specific information implementation for the sub classes if the sub
     * class really required any new implementation then Override the deafault
     * method  If the class not override the defalut method there is no problem
     * of any sub classes this the feature added in java 1.8 onwords
     * */
    default void digitalMeter()
    {
    	System.out.println("c");
    }
}
