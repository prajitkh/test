package com.pro;

public class Fibonacci {
	static int n1 = 0, n2 = 1;

	public static void fibo(int n) {
		if (n > 0) {

			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);

			fibo(n - 1);
		}

	}

	public static void main(String[] args) {
		fibo(5 - 2);
//		int n1 = 0, n2 = 1, n3, count = 100;
//		for (int i = 2; i < count; i++) {
//			n3 = n1 + n2;
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//
//		}
	}

}
