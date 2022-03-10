package Algo;

public class FindDepth {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]= {1,3,2,1,2,5,3,3,4,2};
		
		System.out.println(solution(ar));
		
		
		
		
	}
	public static int solution(int[] A)
	{
		if(A.length<3)
		{
			return 0;
		}
		int initilaHeight=A[0];
		int nextHeight=0;
		int previousMin=0;
		int currentMin=0;
		int depth=0;
		
		for(int i=0;i<A.length;i++)
		{
		if(A[i]<A[i+1])
		{
			
		}
			
			
		}
		
		
		return 1;
	}
}
