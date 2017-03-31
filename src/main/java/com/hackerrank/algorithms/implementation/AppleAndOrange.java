package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by nhari on 30-03-2017.
 */
public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int applesInHouse = 0, orangesInHouse = 0;
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
			final int position = a + apple[apple_i];
			if (s <= position && position<= t) {
				applesInHouse++;
			}
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
			final int position = b + orange[orange_i];
			if (s <= position && position<= t) {
				orangesInHouse++;
			}
		}
		System.out.println(applesInHouse);
		System.out.println(orangesInHouse);
	}
}
