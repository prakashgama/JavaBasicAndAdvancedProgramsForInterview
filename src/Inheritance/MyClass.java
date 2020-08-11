package Inheritance;

public class MyClass implements InterA{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
	
	System.out.println(InterA.old);
	}
	
	public static final int addmore()
	{
	return	InterA.a+InterA.old;
	}

}
