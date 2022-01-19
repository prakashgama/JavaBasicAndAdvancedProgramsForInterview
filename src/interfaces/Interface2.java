package interfaces;

public interface Interface2 extends Interface{
	
	
	public default void	getInterface() {
		System.out.println("Interface2 with boddy");

	}
	public default void	getInterface2() {
		System.out.println("Interface2 with boddy2");

	}
	
	public static void getStatic()
	{
		System.out.println("Interface2 static with boddy");
	}

	public static void getStatic2()
	{
		System.out.println("Interface2 static with boddy");
	}


}
