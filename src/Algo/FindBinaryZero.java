package Algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindBinaryZero {
	
	static Optional  a;
	static String  j;

	public static void main(String[] args) {

		
			
		System.out.println(method1());
			
			
		
	}

	
	public static int method1()
	{

		int a=32;
		
		String s=Integer.toBinaryString(a);
		System.out.println(s);
		
		char x[]=s.toCharArray();
		List g=new ArrayList<>();

		int count1=0;
		int count2=0;
		int loopend=0;
		for(char f:x)
		{
			if(f=='1')
			{
				if(count1>=count2)
				{
					count2=count1;
					count1=0;
				}
			}
			else {
				count1++;
				if(x.length-1==loopend)
				{
					count1=0;
				}
			}
			loopend++;
			
		}
		if(count1>count2)
			return count1;
		else
		{
			return count2;
		}
		
	}
	
}
