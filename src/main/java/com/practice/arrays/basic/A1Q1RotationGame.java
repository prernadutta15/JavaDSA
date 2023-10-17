package com.practice.arrays.basic;

import java.util.Scanner;

/*
 * Problem Description
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.


Problem Constraints
1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109


Input Format
There are 2 lines in the input

Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.

Line 2: A single integer B.


Output Format
Print array A after rotating it B times towards the right.


Example Input
Input 1 :
4 1 2 3 4
2


Example Output
Output 1 :
3 4 1 2


Example Explanation
Example 1 :

N = 4, A = [1, 2, 3, 4] and B = 2.

Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]

Final array = [3, 4, 1, 2]
 */
public class A1Q1RotationGame {
	
	public static void reverse(int a[], int start, int end)
    {   
        int i,j;
        for(i=start,j=end;i<j;i++,j--)
            a[i]=(a[i]+a[j])-(a[j]=a[i]);

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt();
        if(k>=n)
            k = k%n;
        reverse(a, 0, n-1);
        reverse(a, 0, k-1);
        reverse(a, k, n-1);
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
        
        sc.close();
    }

}
