package ExceptionHandling;

public class ExceptionClass {

	public void prakash()
	{
		
		try 
		{
			System.out.println("Hello");
		
		}catch (Exception e) {
			System.out.println("Exception caught");
		}
		finally {
			System.out.println("Finally");
		}
	}
	
	public void akash() throws Exception
	{
		System.out.println("My exception");
	}
	
}
