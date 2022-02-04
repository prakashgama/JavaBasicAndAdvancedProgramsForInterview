package reflection;

public class Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x=(String) test("java.lang.String");
		x="pk";
		System.out.println(x);

	}

	public static Object test(String s)
	{
		
		try {
			System.out.println(Class.forName(s).getClass());
			if(Class.forName(s).getClass().isInstance(String.class))
			{
				System.out.println("true");
				return new String();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	
}
