package com.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nhari on 31-03-2017.
 */
public class BiggerIsGreater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int numberOfInputs = scanner.nextInt();
		for (int i = 0; i < numberOfInputs; i++) {
			final String input = scanner.next();
			final char[] array = input.toCharArray();
			nextPermutation(array);
			System.out.println(array);
		}
	}

	static boolean nextPermutation(char[] array) {
		// Find longest non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i]) {
			i--;
		}
		// Now i is the head index of the suffix
		// Are we at the last permutation already?
		if (i <= 0) {
			return false;
		}
		// Let array[i - 1] be the pivot
		// Find rightmost element that exceeds the pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1]) {
			j--;
		}
		// Now the value array[j] will become the new pivot
		// Assertion: j >= i
		// Swap the pivot with j
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;
		// Reverse the suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		// Successfully computed the next permutation
		return true;
	}
}
