package normal;

public class TestMain {

	public static void main(String[] args) {

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
