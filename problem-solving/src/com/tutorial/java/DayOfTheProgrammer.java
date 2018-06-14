package com.tutorial.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the 256th  day of the year) during a year in the inclusive range from 1700 to 2700 .

From 1700 to 1917 , Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. This means that in 1918 , February 14th  was the 32nd day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has days during a leap year, and days during all other years. In the Julian calendar, leap years are divisible by 4 ; in the Gregorian calendar, leap years are either of the following:

    Divisible by 400.
    Divisible by 4 and not divisible by 100.

Given a year, Y, find the date of the 256th day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is Y.

Input Format

A single integer denoting year Y.

Constraints
1700<= Y<=2700
Output Format

Print the full date of Day of the Programmer during year y in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is Y.

Sample Input 

2017

Sample Output

13.09.2017


 *
 */
public class DayOfTheProgrammer {
	static String solve(int year) {
        if( year == 1918 ) return "26.09.1918";
        if( isLeap( year ) ) return "12.09." + Integer.toString( year );
        else return "13.09." + Integer.toString( year );
    }

    static boolean isLeap( int year ) {
        if( year % 4 != 0 ) return false;
        if( year > 1918 && year % 100 == 0 && year % 400 != 0 ) return false;
        return true;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(solve(year));
        scanner.close();
    }
}
