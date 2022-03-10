package Inheritance;

public class ClassA extends ClassB {
	
	private int a=9;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public ClassA() {
		
		System.out.println("In Class A ");
		
	}
	
	public static void  akash()
	{
		System.out.println("Sstatic A");
	}

}
