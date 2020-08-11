package String;

public class StringAPI {

	
	public static void main(String[] args) {
		
		
		String a=new String("abc");

		String b=new String("abc");
		
		String c="abc";

		String d="abc";
		
		String e=c;
		
		String f=b;
		
		String g=a;

		System.out.println("  a=new String(\\\"abc\\\") , b=new String(\\\"abc\\\") == "+(a==b));
		

		System.out.println(" a=new String(\"abc\") , b=new String(\"abc\") equals "+a.equals(b));
		

		System.out.println(" c=\"abc\" ,d=\"abc\" =="+(c==d));

		System.out.println(" c=\"abc\" ,d=\"abc\" equals "+c.equals(d));
		
		System.out.println(" a=new String(\"abc\"), c=\\\"abc\\\" =="+(a==c));

		System.out.println(" b=new String(\"abc\"), d=\\\"abc\\\" equals "+b.equals(d));

		System.out.println(" e=c; == "+(e==c));

		System.out.println(" e=c; equals "+e.equals(c));
		
		System.out.println(" f=b;,g=a; == "+(f==g));

		System.out.println(" f=b;,g=a; equal "+f.equals(g));
						
		
	}
}
