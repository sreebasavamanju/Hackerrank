package com.java;

import java.util.Scanner;

/**
 * 
 *Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. 
 *Task
Given a string S, of length N that is indexed from 0 to N-1 , print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format

The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a String, S .
Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak
 
 */
public class StringArrayIndex {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		String[] values=new String[n];
		for(int i=0;i<n;i++) {
			values[i]=scan.next();
		}
		printOddEvenvalues(values);
        scan.close();
    }

	private static void printOddEvenvalues(String[] s) {
		int length=s.length;
        for(int i=0;i<length;i++) {
        	 StringBuilder evenIndex=new StringBuilder();
             StringBuilder oddIndex=new StringBuilder();
        	int charlength=s[i].length();
        	char[] charArray = s[i].toCharArray();
        	for(int j=0;j<charlength;j++) {
        	if(j==0) {
        		evenIndex.append(charArray[j]);
        		continue;
        	}
        	if(j%2==0) {
        		evenIndex.append(charArray[j]);
        	}else {
        		oddIndex.append(charArray[j]);
        	}
        }
        	System.out.println(evenIndex+" "+oddIndex);
        }
	}
}
