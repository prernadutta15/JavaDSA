package com.practice.arrays.prefix.sum;

/*
 * 
Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices 
makes the sum of even-indexed and odd-indexed array elements equal.


Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105
Sum of all elements of A <= 109


Input Format
First argument contains an array A of integers of size N


Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array
elements equal.


Example Input
Input 1:
A = [2, 1, 6, 4]
Input 2:

A = [1, 1, 1]


Example Output
Output 1:
1
Output 2:

3


Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
Therefore, the required output is 1. 
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Therefore, the required output is 3.

 */
public class A1Q2SpecialIndex {

	public int solve(int[] a) {

        int i,c=0,totalEven=0,totalOdd=0;
        int evenSum[] = new int[a.length];
        int oddSum[] = new int[a.length];
        evenSum[0]=a[0];
        oddSum[0]=0;
        for(i=1;i<a.length;i++)
	        {
	            if(i%2==0)
	            {
	                evenSum[i]= evenSum[i-1]+a[i];
	                oddSum[i]=oddSum[i-1];
	            }
	            else
	            {
	                oddSum[i] = oddSum[i-1]+a[i];
	                evenSum[i]= evenSum[i-1];
	            }
	        }
        totalOdd = oddSum[a.length-1]-oddSum[0];
        totalEven = evenSum[a.length-1]-evenSum[0];
        if(totalEven==totalOdd)
            c++;
        for(i=1;i<a.length;i++)
        {
            totalEven = evenSum[i-1] + (oddSum[a.length-1]-oddSum[i]);
            totalOdd = oddSum[i-1] + (evenSum[a.length-1]-evenSum[i]);
            if(totalEven == totalOdd)
                c++;
        }
        return c;
    }
}
