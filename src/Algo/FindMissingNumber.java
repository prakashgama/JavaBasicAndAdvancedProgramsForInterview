package Algo;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,5,6,7};
		System.out.println(findmissing(a));
	}

	
	
	 public static int findmissing(int a[])
	{
		
		 int total=((a.length+1)*(a.length+2))/2;
	
		 int arrtotal=0;
		 for(int x:a)
		 {
			arrtotal+=x; 
		 }
	return total-arrtotal;	
	}
	
	
}
