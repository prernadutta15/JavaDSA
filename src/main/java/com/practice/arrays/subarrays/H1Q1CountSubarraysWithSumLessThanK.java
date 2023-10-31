package com.practice.arrays.subarrays;

/*
 * Problem Description
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.



Problem Constraints
1 <= N <= 103

1 <= A[i] <= 1000

1 <= B <= 107



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the number of subarrays in A having sum less than B.



Example Input
Input 1:

 A = [2, 5, 6]
 B = 10
Input 2:

 A = [1, 11, 2, 3, 15]
 B = 10


Example Output
Output 1:

 4
Output 2:

 4


Example Explanation
Explanation 1:

 The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
Explanation 2:

 The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}
 */
public class H1Q1CountSubarraysWithSumLessThanK {

	 public int solveBruteForce(int[] a, int B) 
	    {
	        int n=a.length,i,j,sum=0,count=0;
	        for(i=0;i<n;i++)
	        {
	            sum=0;
	            for(j=i;j<n;j++)
	            {
	                sum+=a[j];
	                if(sum<B)
	                    count++;
	            }
	        }
	        return count;
	    }
	 
	public int solve(int[] arr, int k) 
    {
         int start = 0, end = 0;
        int count = 0, sum = arr[0], n = arr.length;
 
        while (start < n && end < n) {
 
            // If sum is less than k,
            // move end by one position.
            // Update count and sum
            // accordingly.
            if (sum < k) {
                end++;
 
                // if (end >= start)
                    count += end - start;
 
                // For last element,
                // end may become n.
                if (end < n)
                    sum += arr[end];
            }
 
            // If sum is greater than or
            // equal to k, subtract
            // arr[start] from sum and
            // decrease sliding window by
            // moving start by one position
            else {
                sum -= arr[start];
                start++;
            }
        }
 
        return count;
    }
}
