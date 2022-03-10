package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 * int ar[]={1,2,3,546,34,324};
		 * 
		 * System.out.println(Arrays.stream(ar).boxed().sorted((a,b)->b.compareTo(a)).
		 * collect(Collectors.toList()));
		 */

	Test t=new Test();
	//System.out.println(t.fibonacci(50));
	System.out.println(t.fibonacciSol(4));
	
	}
	
	//n+n-1+n-2
//1,1,2,3,5,8,..
	
	public int fibonacci(int n) {
		if(n==0|| n==1) {
		return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		}
	
	
		/*
		 * public int fibonacciSol(int n) { List<Integer> fibNumber=new
		 * ArrayList<Integer>(); if(n==0|| n==1) { fibNumber.add(1); fibNumber.add(1); }
		 * System.out.println(fibNumber.indexOf(1)); for(int i=2;i<=n;i++) {
		 * fibNumber.add(fibNumber.get(i)+fibNumber.get(i));
		 * 
		 * }
		 * 
		 * return fibNumber.get(n);
		 * 
		 * 
		 * }
		 */
	

	public  int fibonacciSol(int n)
	{
		int a= 0;
		int b = 1;
		int presum =a+b;
		int sum=0;
		System.out.println(a+ ",");
		System.out.println(b+ ",");
		//System.out.println(sum);
		for(int i=2;i<n;i++)
		{
			
			
			sum=sum+presum;
			System.out.println(sum);
			presum=sum;
			
			//System.out.println(preSum);
		}
		
		return sum;
	}
	

}
