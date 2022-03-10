package Algo;

public class StringMatch {
	
	public static void main(String[] args) {
		
		
		String str1="Emocation";
		String str2="Annotation";
		
		//System.out.println(str1.substring(1,str1.length()));
		
		System.out.println(substring(str1, str2));
	}


	
	public static String substring(String s,String b)
	{
		if(s.toUpperCase().contains(b.toUpperCase()))
		{
			return b;
		}
		else
		{
			b=b.substring(1, b.length());
		}
		
		return substring(s, b.toUpperCase().toLowerCase());
		
	}

}
