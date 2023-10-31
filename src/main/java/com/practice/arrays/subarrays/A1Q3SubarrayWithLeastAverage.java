package com.practice.arrays.subarrays;

/*
 * Problem Description
Given an array A of size N, find the subarray of size B with the least average.



Problem Constraints
1 <= B <= N <= 105
-105 <= A[i] <= 105


Input Format
First argument contains an array A of integers of size N.
Second argument contains integer B.


Output Format
Return the index of the first element of the subarray of size B that has least average.
Array indexing starts from 0.


Example Input
Input 1:
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
Input 2:

A = [3, 7, 5, 20, -10, 0, 12]
B = 2


Example Output
Output 1:
3
Output 2:

4


Example Explanation
Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average 
among all subarrays of size 3.
Explanation 2:

 Subarray between [4, 5] has minimum average
 */
public class A1Q3SubarrayWithLeastAverage {

	public int solveBruteForce(int[] a, int k) 
    {
       int i,j, sum=0,firstIndex=-1;
            float minAvg=Float.MAX_VALUE;
            for(i=0;i<a.length-k+1;i++)
            {
                sum=0;
                for(j=i;j<i+k;j++)
                sum+=a[j];
                   
               float avg=(float)sum/k;
//               System.out.println("Avg from "+i+" to "+(i+k)+" = "+avg+" and sum = "+sum);
               if(avg<minAvg)
               {
                   minAvg=avg;
                   firstIndex = i;
               }
                
            }
            return firstIndex;
    }
	public int solve(int[] a, int k) 
    {
        int i,j,firstIndex=-1,s,e,n=a.length;
        float minAvg=Float.MAX_VALUE,sum=0f;
        for(i=0;i<k;i++)
            sum+=a[i];
        if(sum<minAvg)
        {
            minAvg=sum;
            firstIndex=0;
        }
        for(s=1,e=k;e<n;e++,s++)
        {
            sum+=(float)a[e]-a[s-1];
            if(sum<minAvg)
            {
                minAvg=sum;
                firstIndex=s;
            }
        }
        return firstIndex;
    }
}
