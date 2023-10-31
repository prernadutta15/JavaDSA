package com.practice.arrays.two.dimensional;

/*
 * Problem Description
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

0 <= A[i][j] <= 103



Input Format
First argument is a 2D integer matrix A.



Output Format
Return a 2D matrix after doing required operations.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output
Output 1:

[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation
Explanation 1:

A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
 */
public class H1Q2RowToColumnZero {

	public int[][] solve(int[][] A) 
    {
        int B[][]=new int[A.length][A[0].length];
          int i,j,x;
          for(i=0;i<A.length;i++)
	  		{
	  			for(j=0;j<A[0].length;j++)
	  			B[i][j]=A[i][j];
	  		}
	  		
  		
          for(i=0;i<A.length;i++)
          {
              for(j=0;j<A[0].length;j++)
              {
                  if(A[i][j]==0)
                  {                     
                      for(x=0;x<B.length;x++)
                      B[x][j]=0;
                      for(x=0;x<B[0].length;x++)
                      B[i][x]=0;
                  }
              }
           
          }
          return B;
    }
}
