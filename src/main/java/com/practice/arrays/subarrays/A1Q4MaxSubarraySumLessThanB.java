package com.practice.arrays.subarrays;
/*
 * Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.


Problem Constraints
1 <= A <= 103
1 <= B <= 109
1 <= C[i] <= 106


Input Format
The first argument is the integer A.
The second argument is the integer B.
The third argument is the integer array C.


Output Format
Return a single integer which denotes the maximum sum.


Example Input
Input 1:
A = 5
B = 12
C = [2, 1, 3, 4, 5]
Input 2:

A = 3
B = 1
C = [2, 2, 2]


Example Output
Output 1:
12
Output 2:

0


Example Explanation
Explanation 1:
We can select {3,4,5} which sums up to 12 which is the maximum possible sum.
Explanation 2:

All elements are greater than B, which means we cannot select any subarray.
Hence, the answer is 0.
 */
public class A1Q4MaxSubarraySumLessThanB {

	public int maxSubarrayBruteForce(int A, int B, int[] C) 
    {
        int max = 0,i,j,sum=0;
        for(i=0;i<A;i++)
        {
            sum=0;
            for(j=i;j<A;j++)
            {
                sum += C[j];
                if(sum<=B)
                    max = Math.max(max,sum);
            }
        }
        return max;
    }
	 public int maxSubarray(int C, int B, int[] A) 
	    {
	        int max = Integer.MIN_VALUE,i,j,sum=A[0],s,e;
	        for(s=0,e=0;s<C && e<C;)
	        {
	            if(sum<=B)
	            {
	                e++;
	                max=Math.max(max,sum);
	                if(e<C)
	                    sum+=A[e];
	            }
	            else
	            {
	                sum-=A[s];
	                s++;
	            }
	        }
	        return max;
	    }
}
