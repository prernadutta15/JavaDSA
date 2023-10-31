package com.practice.arrays.two.dimensional;

/*
 *  Problem Description
	You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

 * Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

{15,10,13,16}
 */
public class A1Q2ColumnSum {
	public int[] solve(int[][] A) {
        int n=A[0].length,i,j,k=0,sum=0;
        int b[]=new int[n];
        for(j=0;j<A[0].length;j++)
        {
            sum=0;
            for(i=0;i<A.length;i++)
            {
                sum+=A[i][j];
            }
            b[k++]=sum;
        }
        return b;
    }
}
