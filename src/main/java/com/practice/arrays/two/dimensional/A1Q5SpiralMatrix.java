package com.practice.arrays.two.dimensional;

/*
 * Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.



Problem Constraints
1 <= A <= 1000



Input Format
First and only argument is integer A


Output Format
Return a 2-D matrix which consists of the elements added in spiral order.



Example Input
Input 1:

1
Input 2:

2
Input 3:

5


Example Output
Output 1:

[ [1] ]
Output 2:

[ [1, 2], 
  [4, 3] ]
Output 2:

[ [1,   2,  3,  4, 5], 
  [16, 17, 18, 19, 6], 
  [15, 24, 25, 20, 7], 
  [14, 23, 22, 21, 8], 
  [13, 12, 11, 10, 9] ]

 */
public class A1Q5SpiralMatrix {

	public int[][] generateMatrix(int n) 
    {
        int a[][]=new int[n][n];
    	int k=1,minRow=0,minCol=0,maxRow=n-1,maxCol=n-1;
    	int i;
    	while(k<=n*n)
    	{
    		for(i=minCol;i<=maxCol;i++)
    			a[minRow][i]=k++;
    		for(i=minRow+1;i<=maxRow;i++)
    			a[i][maxCol]=k++;
    		for(i=maxCol-1;i>=minCol;i--)
    			a[maxRow][i]=k++;
    		for(i=maxRow-1;i>=minRow+1;i--)
    			a[i][minCol]=k++;
    		
    		minCol++;
    		maxCol--;
    		minRow++;
    		maxRow--;
    	}
        return a;
    }
}
