package Algo;

public class FindTape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,1,2,4,3};
		System.out.println(findTape(a));

	}

	
public static int	findTape(int []a)
	{
	int arrtotal=0;
	for(int x:a)
	{
	arrtotal+=x;	
	}
	int min=arrtotal-a[0]-a[0];
	int arrLengh=0;
	for(int x:a)
	{
		arrLengh+=x;
		arrtotal=	arrtotal-x;
		if(arrtotal>0)
		{
		System.out.println(arrtotal);
		if(min>=Math.abs(arrtotal-arrLengh))
		{
		min=	Math.abs(arrtotal-arrLengh);
		System.out.println(min);
		}
		}
	}
	return min;	
	}
}
