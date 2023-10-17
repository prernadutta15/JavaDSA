package com.practice.arrays.basic;

import java.util.Arrays;

/*
 * Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.



Problem Constraints
1 <= A.size() <= 104

1 <= A[i] <= 109

1 <= B <= 109



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return 1 if good pair exist otherwise return 0.



Example Input
Input 1:

A = [1,2,3,4]
B = 7
Input 2:

A = [1,2,4]
B = 4
Input 3:

A = [1,2,2]
B = 4


Example Output
Output 1:

1
Output 2:

0
Output 3:

1
 */
public class A1Q2GoodPair {

	public int solve(int[] A, int B) 
    {
        Arrays.sort(A);
        int i,j,len = A.length;
        int count=0;
        for(i=0,j=len-1;i<j;)
        {
            if(A[i]+A[j] == B)
            {
                count++;
                i++;
                j--;
            }
            else if(A[i]+A[j]>B)
                j--;
            else
                i++;
        }
        return count;
    }
}
