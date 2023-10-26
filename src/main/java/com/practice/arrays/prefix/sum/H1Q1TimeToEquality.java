package com.practice.arrays.prefix.sum;

/*
	Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format
First argument is an integer array A.


Output Format
Return an integer denoting the minimum time to make all elements equal.


Example Input
A = [2, 4, 1, 3, 2]


Example Output
8


Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class H1Q1TimeToEquality {

	public int solve(int[] a) 
    {
        int i,max=a[0],c=0;
        for(i=1;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }
        for(i=0;i<a.length;i++)
        {
            c+=(max - a[i]);
        }
        return c;
    }
}
