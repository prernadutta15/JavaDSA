package com.practice.arrays.others;

import java.util.ArrayList;

/*
 * Problem Description
Given an array of integers A, of size N.

Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

NOTE: It is guaranteed that an answer always exists.



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109



Input Format
The first and only argument given is the integer array A.



Output Format
Return maximum size subarray of A having only non-negative elements. If there are more than one such subarrays, return the one having earliest starting index in A.



Example Input
Input 1:

 A = [5, 6, -1, 7, 8]
Input 2:

 A = [1, 2, 3, 4, 5, 6]


Example Output
Output 1:

 [5, 6]
Output 2:

 [1, 2, 3, 4, 5, 6]


Example Explanation
Explanation 1:

 There are two subarrays of size 2 having only non-negative elements.
 1. [5, 6]  starting point  = 0
 2. [7, 8]  starting point  = 3
 As starting point of 1 is smaller, return [5, 6]
Explanation 2:

 There is only one subarray of size 6 having only non-negative elements:
 [1, 2, 3, 4, 5, 6]
 */
public class H1Q1MaxPositivity {

	public ArrayList<Integer> solve(ArrayList<Integer> A) 
    {
        int i,j,len=0, max=-1,s=-1,e=-1,oldS=-1;
        int n= A.size();
        for(i=0;i<n;i++)
        {
            if(A.get(i)>=0)
            {
                s=e=i;
                break;
            }
        }
        while(s<n && e<n)
        {
            if(A.get(e)>=0)
            {
                if(s==e)
                    len = 1;
                else
                    len++;
                e++;
                if(max<len)
                {
                    oldS = s;
                    max = len;
                }
            }
            else
            {
                e++;
                s=e;
            }
        }
        ArrayList<Integer> output = new ArrayList<>();
        for(i=oldS;i<=oldS+max-1;i++)
            output.add(A.get(i));
        return output;
    }
	
	public ArrayList<Integer> solve2(ArrayList<Integer> A) 
    {
        int i,j,len=0, start=0,end=0,old_start=0;
        int n= A.size();
        for(i=0;i<n;i++)
        {
            if(A.get(i)>=0)
            {
                end = start = i;
                for(j=i+1;j<n;j++)
                {
                    if(A.get(j)>=0)
                        end = j;
                    else   
                        break;
                }
                i=j;
                if(end-start+1>len)
                {
                    len = end - start + 1;
                    old_start = start;
                }
            }
        }
        ArrayList<Integer> output = new ArrayList<>();
        for(i=old_start;i<=old_start+len-1;i++)
            output.add(A.get(i));
        return output;
    }
}
