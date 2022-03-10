package Inheritance;

public class MainTest2  {
	
	public  void test()
	{
		System.out.println("B class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MainTest2 t=new MainTest2();
		t.test();
		t.testt(null);
	}
	public void testt(int a)
	{
		System.out.println("A int");
	}
	public void testt(Object a)
	{
		System.out.println("A obj");
	}
	public void testt(Integer a)
	{
		System.out.println("A");
	}public void testt(long a)
	{
		System.out.println("B");
	}
	public void testt(char a)
	{
		System.out.println("C");
	}

}
