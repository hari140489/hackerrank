package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by nhari on 30-03-2017.
 */
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		int maxHeight = 0;
		int result = 0;
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
			if (height[height_i] > maxHeight) {
				maxHeight = height[height_i];
			}
		}
		for (int height_i = 0; height_i < n; height_i++) {
			if (maxHeight == height[height_i]) {
				result++;
			}
		}
		System.out.println(result);
	}
}
