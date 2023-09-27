package com.pro;

public class Pattern1 {

	public static void pattern11(int n) {

		for (int row = 1; row <= 2 * n; row++) {

			int c = row > n ? 2 * n - row : row;

			for (int j = 0; j < n - c; j++) {
				System.out.print(" ");
			}
			for (int j = c; j >= 1; j--) {
				System.out.print(j);
			}
			for (int a = 2; a <= c; a++) {
				System.out.print(a);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern11(5);
	}

}
