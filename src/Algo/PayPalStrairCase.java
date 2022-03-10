package Algo;

public class PayPalStrairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2, 5, 3, 1, 7, 3, 4};
		
		int min=0;
		int nextmin=0;
		int total=0;
		int nextSteptotal=0;
		for(int i=0;i<a.length;)
		{
			if(a[i]>a[i+1])
			{
				total=total+a[i];
				
			}
		}

	}

}
