package Algo;

import java.util.Arrays;

public class PermutationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,1,2,3};
		System.out.println(test(a));
	}

	
	public static int test(int []A)
	{
		int l=A.length;
		int sum=(int) Arrays.stream(A).mapToLong((x)->x).summaryStatistics().getSum();
		System.out.println(sum);
		
		return l==0?0:(l*(l+1))/2==sum?1:0;
	}
}
