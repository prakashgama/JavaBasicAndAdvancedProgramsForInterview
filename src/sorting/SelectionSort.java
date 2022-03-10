package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,5,6,3,2,4};
		selectionSort(a);
		Arrays.stream(a).forEach(System.out::println);
	}
	
	public static void selectionSort(int a[])
	{
		
		int length=a.length;
		
		for(int i=0;i<length-1;i++)
		{
			
			int min_index=i;
			for(int j=i+1;j<length;j++)
			{
				if(a[j]<a[min_index])
				{
					min_index=j;
					
				}
				
			}
				int temp=a[i];
				a[i]=a[min_index];
				a[min_index]=temp;
				
			
			
			
			
		}
		
	}

}
