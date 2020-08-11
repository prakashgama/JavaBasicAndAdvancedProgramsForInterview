package staticPack;

public  class Static {

	static {
		
		System.out.println("Welcome to static block");
		NoramlClass s=new NoramlClass();
		s.test3();
		Static.test();
		//Static.test2() can not call non static method;
	}
	
	public static String s="prakash";
	
	
	public static NoramlClass test()
	{
		s="raj";
		NoramlClass s=new NoramlClass();
		s.test3();
		System.out.println("Welcome to static method");
		return s;
	}
	
	
	public Static() {
	System.out.println("Welcome to construtor");
	}


	public void test2()
	{
		System.out.println("Welcome to non static method "+s);
		
	}
}
