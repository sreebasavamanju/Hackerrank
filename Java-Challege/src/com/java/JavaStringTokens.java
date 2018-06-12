package com.java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, 
 * split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
 * Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, s.

Constraints
	1<= legth of s <=4*10 pow 5	
	s is composed of any of the following: English alphabetic letters,
	 blank spaces, exclamation points (!), commas (,), question marks (?), 
	 periods (.), underscores (_), apostrophes ('), and at symbols (@).

Output Format

On the first line, print an integer,n , denoting the number of tokens in string s
(they do not need to be unique). Next, print each of the tokens on a new line in the same order
 as they appear in input string s.

Sample Input

He is a very very good boy, isn't he?

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

 */
public class JavaStringTokens {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        	String[] split = s.split("[^a-zA-Z0-9]");
        	System.out.println(Arrays.stream(split).filter(data->!data.isEmpty()).count());
        	Arrays.stream(split).filter(data->!data.isEmpty()).forEach(System.out::println);
        scan.close();
    }
}
