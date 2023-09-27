package com.pro;

public class A {

//	static void printPattren(int n) {
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n - i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
//	}
//
//	static void printPattren2(int n) {
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//
//		}
//	}
	static class B {
		static String getText() {
			return "HEllo";
		}
	}

	static void printPattren3(int n) {

		for (int i = 0; i < n; i++) {
			int totalColumn = i > n ? 2 * n - i : i;
			for (int j = 0; j < totalColumn; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
//		printPattren(5);
		printPattren3(5);

	}
}