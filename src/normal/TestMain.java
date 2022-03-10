package normal;

public class TestMain {
	
	void start() 
	 {
	 boolean b1 = false;
	 boolean b2 = fix(b1);
	 System.out.println(b1 + " " + b2);
	 }
	 boolean fix(boolean b1) 
	 {
	 b1 = true;
	 return b1;
	 }

	public static void main(String[] args) {

		
		TestMain te=new TestMain();
		te.start();
		Test t=new Test();

		System.out.println(t.x);
		
		for(int i=0;true;i++)
		{
			System.out.println("Hello");
			break;
		}
		for(int i=1;true;i++)
		{
			
			if(i/i==1)
			{
				System.out.println("Hey"+i);
				if(i==34)
				{
					System.out.println("Bye"+i);
					break;
				}
				continue;
			}
			
		}
	}
}
