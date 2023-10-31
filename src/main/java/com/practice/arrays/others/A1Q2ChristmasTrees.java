package com.practice.arrays.others;

/*
 * Problem Description
You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
The cost of these trees is Bp + Bq + Br.

You are to choose 3 trees such that their total cost is minimum. Return that cost.

If it is not possible to choose 3 such trees return -1.



Problem Constraints
1 <= A[i], B[i] <= 109
3 <= size(A) = size(B) <= 3000



Input Format
First argument is an integer array A.
Second argument is an integer array B.



Output Format
Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in increasing order, if not possible, -1.



Example Input
Input 1:

 A = [1, 3, 5]
 B = [1, 2, 3]
Input 2:

 A = [1, 6, 4, 2, 6, 9]
 B = [2, 5, 7, 3, 2, 7]


Example Output
Output 1:

 6 
Output 2:

 7  
 */
public class A1Q2ChristmasTrees {

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
