package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by nhari on 30-03-2017.
 */
public class GradingStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			if (grade < 38) {
				System.out.println(grade);
			}
			else {
				final int roundOffValue = (Math.round(grade / 5) * 5) + 5;
				System.out.println(
					roundOffValue - grade >= 3 ? grade : roundOffValue);
			}
		}
	}
}
