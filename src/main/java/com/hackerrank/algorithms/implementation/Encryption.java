package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by nhari on 30-03-2017.
 */
public class Encryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] chars = s.toCharArray();
		int length = s.length();
		double sqrt = Math.sqrt(length);
		double floor = Math.floor(sqrt);
		double ceil = Math.ceil(sqrt);
		if (floor * ceil < length) {
			floor = ceil;
		}
		char charMatrix[][] = new char[((int) floor)][((int) ceil)];
		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < ceil; j++) {
				final int index = i * ((int) ceil) + j;
				if (index < length) {
					charMatrix[i][j] = chars[index];
				}
			}
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < ceil; i++) {
			for (int j = 0; j < floor; j++) {
				final char c = charMatrix[j][i];
				if (c != '\u0000') {
					result.append(c);
				}
			}
			result.append(" ");
		}
		System.out.print(result.toString().trim());
	}
}
