package interfaces;


public interface FunctionInterA {

	public abstract void test();
	
	public default void deafaultMethod()
	{
		System.out.println("Default Method A");
	}

	public static void staticMethod()
	{
		System.out.println("Default Method A");
	}
	
	
	
	
	 public  int hashCode();
	 
	 
	 

}
