package com.practice.arrays.others;

/*
 * Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
 */
public class A1Q1LongestConsecutiveOnes {

	public int solve(String A) 
    {
        int i,j,ls=0,rs=0;
        int ans=0,totalOnes=0;
        for(i=0;i<A.length();i++)
            if(A.charAt(i)=='1')
                totalOnes++;
        for(i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='0')
            {
                ls=0;
                rs=0;
                for(j=i-1;j>=0 && A.charAt(j)=='1'; j--)
                    ls++;
                for(j=i+1;j<A.length() && A.charAt(j)=='1';j++)
                    rs++;
                if(ls+rs == totalOnes)
                    ans = Math.max(ans,ls+rs);
                else
                    ans = Math.max(ans,ls+rs+1);
            }
        }
        if(totalOnes==0)
            return 0;
        if(ans==0)
            return A.length();
        return ans;
    }
}
