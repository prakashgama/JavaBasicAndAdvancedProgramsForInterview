package obj;

import interfaces.FunctionalInterB;

public class Concetric{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ap[]= {1,2,3,1,2,4};
		
		int c=Math.abs(ap[0]-ap[1]);
		
		for(int i=1;i<ap.length-1;i++)
		{
			if(Math.abs(ap[i]-ap[i+1])>c)
			{
				c=Math.abs(ap[i]-ap[i+1]);
			}
		}
		System.out.println(c);
		
		System.out.println(test1(1,23,4,5));
		System.out.println(test2(ap));
		foo(null);
		sum(20, 20);
		try 
		{ 
		    int x = 0; 
		    int y = 5 / x; 
		} 
		catch (Exception e) 
		{
		    System.out.println("Exception"); 
		} 
		/*
		 * catch (ArithmeticException ae) { System.out.println(" Arithmetic Exception");
		 * }
		 */
		System.out.println("finished");

		try 
        { 
            return;
        } 
        finally 
        {
            System.out.println( "Finally" ); 
        }
		
		
	}
	
	public static int test1(int...a)
	{
		System.out.println("tet1"+a[0]);
		return 0;
		
	}
	public static int test2(int []a)
	{
		System.out.println("tet2"+a[0]);
		return 0;
		
	}
	
	
//	static void sum(int a,long b){System.out.println("a method invoked");} 
	// static void sum(long a,int b){System.out.println("b method invoked");}
	 static void sum(long a,long b){System.out.println("c method invoked");}

	public void test(int x) 
	{ 
	    int odd = 1; 
	    if(true) 
	    {
	        System.out.println("odd"); 
	    } 
	    else 
	    {
	        System.out.println("even"); 
	    } 
	}
	public static void foo(Object o) {
		System.out.println("NUll PARAMETER Object argument");
	}
	public static void foo(String s) {
		System.out.println("NUll PARAMETER String argument");
	}
	
  
	/*
	 * public static void foo(StringBuffer i){
	 * System.out.println("StringBuffer impl"); }
	 */
}