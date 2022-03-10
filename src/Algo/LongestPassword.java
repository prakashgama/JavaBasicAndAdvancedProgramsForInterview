package Algo;

public class LongestPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="zaq123edc abcdef12345";
		
		System.out.println(solution(s));
	}

	 public static int solution(String S) {
	        
	String a[]=S.split(" ");
	int maxCurrent=-1;
	int maxOld=-1;
	for(String x:a)
	{   
		 boolean evenChar=true;
		    boolean oddDigit=false;
	for(int i=0;i<x.length();i++)
	{
	   
	if(Character.isAlphabetic(x.charAt(i)) || Character.isDigit(x.charAt(i)))
	{
	    if(Character.isAlphabetic(x.charAt(i)))
	    {

			
	if(evenChar)
	{
		
	    evenChar=false;
	}else{
	    evenChar=true;
	}
	    }
	    else
	    {
	if(!oddDigit)
	{
	    oddDigit=true;
	}else{
	    oddDigit=false;
	}
	    }
	  
	}
	else{
	    break;
	}
	if(i==(x.length()-1) && evenChar && oddDigit)
	{
		maxCurrent=x.length();
	    if(maxCurrent>maxOld)
	    {
	    	maxOld=maxCurrent;
	    }
	}
	}
	}
	return maxOld;
	    }
	
}
