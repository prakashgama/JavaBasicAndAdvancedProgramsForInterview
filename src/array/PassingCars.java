package array;

public class PassingCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,1,0,1,1,1};
		
		Long L=1000000000342341234l;
		Long M=1000000000342341234l;
		
		System.out.println(L.equals(M));
		
		System.out.println(solution(a));

	}

	
	public static int solution(int []A)
	{
		
		int count=0;
		for(int i=0;i<A.length;i++)
		{
		if(A[i]==0)
		{ int j=i+1;
		while(j<A.length)
		{
			if(A[j]==1)
				count++;
			j++;
		}
		}
			
			
		}
		
		return count>0?count:-1;
	}
}
