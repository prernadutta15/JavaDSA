package com.practice.arrays.carry.forward;

/*
 * Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation
Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.
 */
public class A1Q2ClosestMinMax {

	public int solve(int[] a) 
    {
        int i,min=a[0],max = a[0],closest_min = -1, closest_max = -1, ans = a.length+1;
        for(i=1;i<a.length;i++)
        {
            if(a[i]<min)
                min = a[i];
            if(a[i]>max)
                max = a[i];
        }
        if(min == max)
            return 1;
        for(i=0;i<a.length;i++)
        {   
            if(a[i]==max)
            {
                closest_max=i;
                if(closest_min!=-1)
                    ans = Math.min(ans, i-closest_min+1);
            }
            else if(a[i]==min)
            {
                closest_min=i;
                if(closest_max!=-1)
                    ans = Math.min(ans, i-closest_max+1);
            }

        }
        return ans;
    }
	
}
