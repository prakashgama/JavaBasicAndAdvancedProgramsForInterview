package array;

import java.util.Arrays;

public class CyclicRotationArray {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4};
		System.out.println(Arrays.toString(a));
	
		a=rotateArrayCyclic(a);
		a=rotateArrayCyclic(a);
		a=rotateArrayCyclic(a);

		a=rotateArrayACyclic(a);
		a=rotateArrayACyclic(a);
		a=rotateArrayACyclic(a);
		
		a=rotateArrayCyclicRecurrison(a, 3);
		a=rotateArrayACyclicRecurssion(a, 3);
		
	}

	
	public static int [] rotateArrayCyclic(int[]a)
	{	int b[]=new int[a.length];
		
		int y=0;
		for(int x=1;x<a.length;x++)
		{
		b[y]=a[x];
			y++;
		}
			b[a.length-1]=a[0];
			
			System.out.println(Arrays.toString(b));
		
			return b;
	}
	
	public static int [] rotateArrayCyclicRecurrison(int[]a,int rotate)
	{	
		if(rotate==0)
		{
			return a;
		}
		int b[]=new int[a.length];
		
		int y=0;
		for(int x=1;x<a.length;x++)
		{
		b[y]=a[x];
			y++;
		}
			b[a.length-1]=a[0];
			
			System.out.println(Arrays.toString(b));
		
			return rotateArrayCyclicRecurrison(b, rotate-1);
	}
	
	public static int [] rotateArrayACyclic(int[]a)
	{	int b[]=new int[a.length];
		
		int y=1;
		for(int x=0;x<a.length-1;x++)
		{
		b[y]=a[x];
			y++;
		}
			b[0]=a[a.length-1];
			
			System.out.println(Arrays.toString(b));
		
			return b;
	}
	
	public static int [] rotateArrayACyclicRecurssion(int[]a,int rotate)
	{	
		if(rotate==0)
		{
			return a;
		}
		int b[]=new int[a.length];
		int y=1;
		for(int x=0;x<a.length-1;x++)
		{
		b[y]=a[x];
			y++;
		}
			b[0]=a[a.length-1];
			System.out.println(Arrays.toString(b));
			return rotateArrayCyclicRecurrison(b, rotate-1);
	}
	
}
