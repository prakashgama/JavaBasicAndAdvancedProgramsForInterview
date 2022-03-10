package Algo;
// Java program to find the maximum stolen value

/*arr = {5, 5, 10, 100, 10, 5}
Maximize loot of Thief - 5 + 100 + 5 = 110

arr = {100, 5, 10, 100, 10, 5}
Maximize loot of Thief - 100 + 100 + 5 = 205

arr = {95, 5, 95, 100, 95, 5}
Maximize loot of Thief - 95 + 95 + 95 = 285*/
import java.io.*;

class MaximumStolen
{
	// Function to calculate the maximum stolen value
	static int maxLoot(int hval[], int n)
	{
		if (n == 0)
		return 0;
		if (n == 1)
			return hval[0];
		if (n == 2)
			return Math.max(hval[0], hval[1]);

		// dp[i] represent the maximum value stolen
		// so far after reaching house i.
		int[] dp = new int[n];

		// Initialize the dp[0] and dp[1]
		dp[0] = hval[0];
		dp[1] = Math.max(hval[0], hval[1]);
System.out.println("Array dp "+0+" value "+dp[0]);
System.out.println("Array dp "+1+" value "+dp[1]);
		// Fill remaining positions
		for (int i = 2; i<n; i++)
		{
			System.out.println("Array "+hval[i]+"Array "+dp[i-2]+" next original "+(hval[i]+dp[i-2])+" old value "+dp[i-1]);
			dp[i] = Math.max(hval[i]+dp[i-2], dp[i-1]);
			System.out.println("Array dp "+i+" value "+dp[i]);
		}
		return dp[n-1];
	}
	
	// Driver program
	public static void main (String[] args)
	{
		int hval[] = {6, 7, 1, 3, 8, 2, 4};
		int n = hval.length;
		System.out.println("Maximum loot value : " + maxLoot(hval, n));
	}
}

// Contributed by Pramod Kumar
