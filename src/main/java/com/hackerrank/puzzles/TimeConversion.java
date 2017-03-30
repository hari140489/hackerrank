package com.hackerrank.puzzles;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final String time = in.next();
		final String[] split = time.split(":");
		final String meridian = split[2].substring(split[2].length() - 2);
		if ("PM".equals(meridian) && Integer.valueOf(split[0]) < 12) {
			split[0] = (12 + Integer.valueOf(split[0])) + "";
		}
		else if ("AM".equals(meridian) && Integer.valueOf(split[0]) >= 12) {
			split[0] = (Integer.valueOf(split[0]) - 12) + "";
		}
		System.out.println(
			(split[0].length() == 1 ? "0" + split[0] : split[0]) + ":"
				+ split[1] + ":" + split[2].substring(0,
				split[2].length() - 2));
	}
}
