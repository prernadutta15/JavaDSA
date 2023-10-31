package com.practice.arrays.two.dimensional;

/*
 * You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.



Problem Constraints
1 <= n <= 1000



Input Format
First argument is a 2D matrix A of integers



Output Format
Return the 2D rotated matrix.



Example Input
Input 1:

 [
    [1, 2],
    [3, 4]
 ]
Input 2:

 [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
 ]


Example Output
Output 1:

 [
    [3, 1],
    [4, 2]
 ]
Output 2:

 [
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
 ]
 */
public class A1Q6RotateMatrix {

	public int[][] solve(int[][] A) 
    {
        int i,j,n=A.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            A[i][j]=(A[i][j]+A[j][i])-(A[j][i]=A[i][j]);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n/2;j++)
            A[i][j]=(A[i][j]+A[i][n-j-1])-(A[i][n-j-1]=A[i][j]);
        }
        return A;
    }
}
