package com.java;

import java.util.Scanner;

/**
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Input Format

The first line contains an integer, N(the size of our array).
The second line contains N space-separated integers describing array A's elements.

Constraints
1<=N<=1000
1<=A<=10000

Output Format

Print the elements of array A in reverse order as a single line of space-separated numbers.

Sample Input

4
1 4 3 2

Sample Output

2 3 4 1

 */
public class ReverseArrayElements {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int length=arr.length;
        for (int i = length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}

        scanner.close();
    }

}
