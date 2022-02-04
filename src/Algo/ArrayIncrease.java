package Algo;

import java.util.stream.Stream;

public class ArrayIncrease {
//https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,4,4,6,1,4,4};
		int x[]=solve(5, a);
for(int i=0;i<5;i++)
{
	System.out.println(x[i]);

	
}
String t="prakash";
System.out.println(t.substring(0,1));
		
	}

	public static int[] solve(int N, int []a)
	{
		int x[]=new int[N];
		int max=0;
		int oldmax=0;
		for(int i=0;i<N;i++)
		{
			x[i]=0;
		}
		
		for(int c:a)
		{
			if(c<=N)
			{
			
			x[c-1]=x[c-1]+1;	
			
			max=x[c-1];
			if(max>=oldmax)
			{
				oldmax=max;
			}
				
			}else
			{
			 for(int j=0;j<N;j++)
			 {
				x[j]=oldmax;
				
			 }
			}
		}
		
		return x;
	}
	
	
}
