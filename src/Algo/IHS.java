package Algo;

public class IHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3,5,7,8,9};
		
		int arr2[]= {1,4,6,10};
		
		sortArr(arr, arr2);
		
	}

public static int[]	sortArr(int[] arrayA,int []arrayB)
	{
	
	int[] mergedArray = new int[arrayA.length + arrayB.length];
    
    int i=0, j=0, k=0;
     
    while (i < arrayA.length && j < arrayB.length)
    {
        if (arrayA[i] < arrayB[j]) 
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        } 
        else
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }
    } 
             
    while (i < arrayA.length) 
    {
        mergedArray[k] = arrayA[i];
        i++;
        k++;
    } 
             
    while (j < arrayB.length) 
    {
        mergedArray[k] = arrayB[j];
        j++;
        k++;
    } 
    for(int x:mergedArray)
	{
		System.out.println(x);
	}   
    return mergedArray;
	}
	
	
	
	
	
}
