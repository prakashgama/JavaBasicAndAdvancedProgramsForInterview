package Algo;

public class CountDiv {
	
	public static void main(String[] args) {
		
		int a=6;
		int b=12;
		int c=2;
		
		
		System.out.println(solution(a, b, c));
	
		
		
	}
	
	public static int solution(int A,int B,int K)
	{
		int count =0;
		int rem=B-A;
		int result=0;
		if(A%K==0)
		{
			count++;
		}
		if(B%K==0)
		{
		count++;	
		}
		result=rem/K;
		if(count>0)
		{
			
			result++;
		}
		
		
		return result;
	}

}
