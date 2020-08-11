package Inheritance;

public class Parents {

private int a=9;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void display()
	{
		System.out.println("Parent display method");
	}
	public Parents() {
		super();
		System.out.println("Parent cons");
	}

}
