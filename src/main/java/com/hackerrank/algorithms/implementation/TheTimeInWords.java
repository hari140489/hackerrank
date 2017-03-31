package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by nhari on 31-03-2017.
 */
public class TheTimeInWords {

	public static void main(String[] args) {
		String[] numNames = { "zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen", "twenty", "twenty one", "twenty two",
			"twenty three", "twenty four", "twenty five", "twenty six",
			"twenty seven", "twenty eight", "twenty nine" };
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		if (m == 0) {
			System.out.println(numNames[h] + " o' clock");
		}
		else if (0 < m && m < 30) {
			if (m == 1) {
				System.out.println("one minute past " + numNames[h]);
			}
			else if (m == 15) {
				System.out.println("quarter past " + numNames[h]);
			}
			else {
				System.out.println(
					numNames[m] + " minutes past " + numNames[h]);
			}
		}
		else if (m == 30) {
			System.out.println("half past " + numNames[h]);
		}
		else if (30 < m && m < 60) {
			final int diff = 60 - m;
			if (diff == 1) {
				System.out.println("one minute to " + numNames[h + 1]);
			}
			else if (diff == 15) {
				System.out.println("quarter to " + numNames[h + 1]);
			}
			else {
				System.out.println(
					numNames[diff] + " minutes to " + numNames[h + 1]);
			}
		}
	}
}
