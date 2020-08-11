package Inheritance;

public class Child extends Parents {
	
private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void show()
	{
		System.out.println("Child show method");
	}

	public Child() {
		super();
		this.a=super.getA();
		System.out.println("Child constructor");
	}
	
	

}
