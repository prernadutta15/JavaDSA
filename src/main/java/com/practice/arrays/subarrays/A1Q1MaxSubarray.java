package com.practice.arrays.subarrays;

/*
 * Problem Description
Find the maximum sum of contiguous non-empty subarray within an array A of length N.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

 A = [1, 2, 3, 4, -10] 
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 


Example Output
Output 1:

 10 
Output 2:

 6 


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6. 

 */
public class A1Q1MaxSubarray {

	public int maxSubArray(int[] a) {
		int i, n = a.length, local = 0, global = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {
			local += a[i];
			global = Math.max(global, local);
			if (local < 0)
				local = 0;
		}
		return global;
	}
}
