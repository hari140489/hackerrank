package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by nhari on 30-03-2017.
 */
public class NonDivisibleSubset {

	public static void main(String[] args) {
		//		Scanner in = new Scanner(System.in);
		//		final int n = in.nextInt();
		//		final int k = in.nextInt();
		//		final int[] set = new int[n];
		//		for (int i = 0; i < n; i++) {
		//			set[i] = in.nextInt();
		//		}
		//		for (int i = (1 << n) - 1; i >= 0; i--) {
		//			for (int j = n - 1; j >= 0; j--) {
		//				if ((i & (8 >> j)) > 0) {
		//					System.out.print(set[j]);
		//				}
		//			}
		//			System.out.println("");
		//		}
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = scan.nextInt();
		}
		int[] cnts = new int[k];
		for (int i = 0; i < n; ++i) {
			final int m = arr[i] % k;
			cnts[m] = cnts[m] + 1;
		}
		int cnt = cnts[0] < 1 ? cnts[0] : 1;
		for (int i = 1; i < k / 2 + 1; ++i) {
			if (i != k - i) {
				cnt += cnts[i] > cnts[k - i] ? cnts[i] : cnts[k - i];
			}
		}
		if (k % 2 == 0) { cnt += 1; }
		System.out.println(cnt);
	}
}
