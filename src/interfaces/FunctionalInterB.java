package interfaces;


public interface FunctionalInterB  {
	
	public abstract void tests();
	
	public default void deafaultMethod()
	{
		System.out.println("Default Method B");
	}
	
	public static void staticMethod()
	{
		System.out.println("static Method B");
	}
	

}
