package Algo;

public class PayPalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(solve(41, 18467));
		
	}

	
	public static long solve(int x,int y)
	{
		long sum =0;
		
		
		for(int i=x;i<=y;i++)
		{
			
			if(checknumbr(i))
			sum=sum+i;	
			
		}
		
		
		return sum;
	}
	
	public static boolean checknumbr(int n)
	{
		int slow,fast;
		slow=fast=n;
		do
		{
			slow=checkbeautifulNumber(slow);
			
			fast=checkbeautifulNumber(checkbeautifulNumber(fast));
		}while(slow!=fast);
		
		
			return slow==1;
		
	}
	
	public static int checkbeautifulNumber(int n)
	{
		int squar=0;
		while(n!=0)
		{
			squar=squar+(n%10)*(n%10);
			n/=10;
		}
		return squar;
	}
	
}
