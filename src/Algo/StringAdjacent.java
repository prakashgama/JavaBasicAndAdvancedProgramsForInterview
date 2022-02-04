package Algo;

import java.util.Arrays;

public class StringAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="CD";
		sol(x);
	}
	
	public static String solution(String S)
	{
		
		System.out.println(S);
char a[]=S.toCharArray();
		
		for(int i=1;i<a.length;i++)
		{
			
			if(i>=1 && i<a.length-1 && a[i]=='A')
			{
				
			if(a[i-1]=='B')
			{
				a[i]=' ';
				a[i-1]=' ';
				
			}
			else if(a[i+1]=='B')
			{
				a[i]=' ';
				a[i+1]=' ';
			}
	
			}
			if(i>=1 && i<a.length-1 && a[i]=='C')
			{
				
			if(a[i-1]=='D')
			{
				a[i]=' ';
				a[i-1]=' ';
				
			}
			else if(a[i+1]=='D')
			{
				a[i]=' ';
				a[i+1]=' ';
			}
	
			}
		}
		String newString=String.valueOf(a).replace(" ", "").trim();
		if(newString.contains("AB") || newString.contains("BA")
				|| newString.contains("CD") || newString.contains("DC") )
		{
			newString.replace("AB", "");
			newString.replace("BA", "");
			newString.replace("CD", "");
			newString.replace("DC", "");
			newString=	solution(newString.replace("AB", ""));
		}
	return newString;
	
	}
	
	public static String sol(String S)
	{
		if(S.length()==0)
			return "";

		if(S.contains("AB") || S.contains("BA")
				|| S.contains("CD") || S.contains("DC") )
		{
		S=	S.replace("AB", "");
		S=	S.replace("BA", "");
		S=	S.replace("CD", "");
		S=	S.replace("DC", "");
			S=	sol(S);
		}
		else
		{
			return S;
		}
		return S;
		
		
	}

}
