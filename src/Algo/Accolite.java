package Algo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Accolite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Find non-repeating number (like- 7)
		 * arr[]={1,2,2,1,8,8,7,35,35,24,24};(restrictions ->no-collections,no-sorting)
		 */
		System.out.println(Integer.MIN_VALUE);
		int arr[]={1,2,2,7,8,8,7,35,35,24,24};
		System.out.println(findUniq(arr));
	int	abc[]={12, 35, 1, 10, 34, 1,76,99,98};
		
		System.out.println(findSecondHigh(abc));
		
	int	pair[]={1,4,2,5,8,9,7,35,64,24};
		System.out.println(findPairofSum(pair, 10));
		
		
		System.out.println("2nd Largest"+print2largest(abc));
	}

	
	public static int findUniq(int []a)
	{
		int uniq=0;
		for(int x:a)
		{
		uniq=uniq^x;
		}
		
		return uniq;
	}
	
	//3 -->011 4-   
	/*
	 * Find all pairs example If the sum of both the numbers is equal to the sum
	 * then print that pair arr[]={1,4,2,5,8,9,7,35,64,24};sum=10;
	 */
	
	public static Map<Integer,Integer> findPairofSum(int[] a,int sum)
	{
		
		List<Integer> x= Arrays.stream(a).boxed().filter(y->y<sum).toList();
		System.out.println(x);
		
		Map<Integer,Integer> h=x.stream().collect(Collectors.toMap(t->sum-t,Function.identity()));
		return h;
	}
	
	
	/*
	 * Find second highest number arr[]={12, 35, 1, 10, 34, 1};(restrictions->
	 * no-collections,no-sorting)
	 */
	
	
	public static int findSecondHigh(int a[])
	{
		int i=0;
		int max=0;
		int secondmax=0;
		while(i<a.length)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			i++;
		}
		System.out.println(max);
		i=0;
		while(i<a.length)
		{
			if(max>a[i] )
			{
				if(a[i]>secondmax)
				secondmax=a[i];
			}
			i++;
		}
	return secondmax;
	}
	
	
	public static int print2largest(int arr[])
{
int i, first, second;
int arr_size=arr.length;
/* There should be atleast two elements */
if (arr_size < 2) {
System.out.print(" Invalid Input ");
return 0;
}

first = second = Integer.MIN_VALUE;
for (i = 0; i < arr_size; i++) {
/* If current element is greater than
first then update both first and second */
if (arr[i] > first) {
second = first;
first = arr[i];
}

/* If arr[i] is in between first and
second then update second  */
else if (arr[i] > second && arr[i] != first)
second = arr[i];
}

if (second == Integer.MIN_VALUE)
System.out.print("There is no second largest"
    + " element\n");
else
System.out.println("The second largest element"
    + " is " + second);

return second;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
