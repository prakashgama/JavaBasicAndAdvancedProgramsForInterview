package Inheritance;

public class MethodCall {

	public static void main(String[] args) {

		MethodCall a=new MethodCall();
		
String s=new String();
s="Prakash";
a.prakash(s);
System.out.println(s);
	}

	public void prakash(String s)
	{
		akash(s);
		System.out.println(s);
	}
	public void akash(String s)
	{
		s="akash";
		System.out.println(s);
	}

}
