package a;

public class TestInterface  {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestInter t=()->System.out.println("Hello");
		t.tests();
		myTestInte(t);
	}
	//() -> System.out.println("Hello");
	
	
	public static void myTestInte(TestInter t)
	{
	t.tests();
		
	}
}
