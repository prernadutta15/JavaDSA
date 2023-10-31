package com.practice.arrays.carry.forward;

/*
 * You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
 */
public class H1Q1AmazingString {

	 public int solve(String A) 
	    {
	        int i,j,len = A.length(),ans=0;
	        for(i=0;i<len;i++)
	        {
	            if(isVowel(A.charAt(i)))
	            {
	                ans= (ans + len-i)%10003;
	            }
	        }
	        return ans%10003;
	    }
	    boolean isVowel(char c)
	    {
	        c=Character.toUpperCase(c);
	        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	            return true;
	        return false;
	    }
}
