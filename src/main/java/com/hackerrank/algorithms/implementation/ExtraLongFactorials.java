package com.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by nhari on 30-03-2017.
 */
public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger factorial = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			factorial = factorial.multiply(new BigInteger(""+i));
		}
		System.out.println(factorial);
	}
}
