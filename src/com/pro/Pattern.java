package com.pro;

import java.util.ArrayList;

public class Pattern {

	static boolean isInteger(String n) {
		boolean isv;

		try {
			Integer.parseInt(n);
			isv = true;
		} catch (Exception e) {
			isv = false;
		}
		return isv;

	}

	private static void pattern2(int n) {

		for (int i = 1; i <= 2 * n; i++) {
			int var = i > n ? 2 * n - i : i;
			for (int s = 1; s <= var; s++) {
				System.out.print("* ");
			}

			System.out.println();

		}
	}

	private static void pattern3(int n) {
		int ro;
		for (int i = 1; i <= n; i++) {

			for (int sp = 1; sp <= n - i; sp++) {

				System.out.print(" ");
			}
			for (ro = i; ro >= 1; ro--) {
				System.out.print(ro);
			}
			for (int k = 2; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println();

		}

	}

	private static void pattern4(int n) {

		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print("*");
			}

			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void pattern5(int n) {

		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// pattern1();
		pattern5(5);
		String name = "prajit kahs 53 #@!@!@ 12234 the 67 specific value of the 654";
		String[] ss = name.split(" ");
		isInteger(name);
		for (String string : ss) {
			if (isInteger(string)) {
				// System.out.println(string);
			} else {

			}
		}
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Prajit");
		cars.add("suraj");
		cars.add("Viraj");
		cars.add("BIt");
		// System.out.println(cars);
	}

}
