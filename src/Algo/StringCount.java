package Algo;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="aaaabbbaab";
		
		StringBuilder d=new StringBuilder();
		
		for(int j=0;j<s.length();j++)
		{
		int count =1;
		int i=j+1;;
		d.append(s.charAt(j));
		while(i<s.length() )
		{
			if(s.charAt(j)==s.charAt(i))
			{
				count++;
				i++;
			}
			else
			{
				j=i-1;
				break;
				
			}
		}
			d.append(count);
			
		
		}
		System.out.println(d);
		
	}

	public static String checkCount(String s,Character A)
	{
		int count=0;
	for(int i=0;i<s.length();i++)	
	{
		if(s.charAt(0)==A)
		{
			count++;
		}else
		{
			break;
		}
	}
		return A.toString()+count;
	}
	
}
