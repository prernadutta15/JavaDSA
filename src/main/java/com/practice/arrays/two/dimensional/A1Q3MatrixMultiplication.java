package com.practice.arrays.two.dimensional;

/*
 * Problem Description
You are given two integer matrices A(having M X N size) and B(having N X P). You have to multiply matrix A with B and return the resultant matrix. (i.e. return the matrix AB).

Matrix Multiplication 


Problem Constraints
1 <= M, N, P <= 100

-100 <= A[i][j], B[i][j] <= 100



Input Format
The first argument given is the 2-D integer matrix A.
The second argument given is the 2-D integer matrix B.



Output Format
Return a 2D integer matrix denoting AB.



Example Input
Input 1:

A = [[1, 2],
     [3, 4]]
B = [[5, 6],
     [7, 8]]
Input 2:

A = [[1, 1]]
B = [[2],
     [3]]


Example Output
Output 1:

 [[19, 22],
  [43, 50]]
Output 2:

 [[5]]

 */
public class A1Q3MatrixMultiplication {

public int[][] solve(int[][] A, int[][] B) {
        
        int i,j,k,n=A.length, m=A[0].length, p = B[0].length;
        int P[][]=new int[n][p];
        for(i=0;i<n;i++)
        {
            for(j=0;j<p;j++)
            {
                P[i][j]=0;
                for(k=0;k<m;k++)
                    P[i][j]+=A[i][k]*B[k][j];
            }
        }
        return P;
    }
}
