package basic;

public class TestA implements InterfacA{
	
	static
	{
		System.out.println("Test A");
	}

	public TestA() {
		// TODO Auto-generated constructor stub
		System.out.println("COnstructor A");
	}
	
	
	public void print()
	{
		System.out.println("print A");
	}
	
	public static class ClassA implements InterfacA
	{
		static
		{
			System.out.println("ClassA A");
		}

		public ClassA() {
			// TODO Auto-generated constructor stub
			System.out.println("COnstructor ClassA A");
		}
		
		
		public void print()
		{
			System.out.println("print ClassA A");
		}
	}
	public static class ClassB
	{
		static
		{
			System.out.println("ClassB A");
		}

		public ClassB() {
			// TODO Auto-generated constructor stub
			System.out.println("COnstructor ClassB A");
		}
		
		
		public void print()
		{
			System.out.println("print ClassB A");
		}
	}
	
}
