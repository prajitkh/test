
package com.pro;

public class MissingNumber {
	static int missingNumber(int array[], int n) {

		int temp[] = new int[n + 1];

		for (int i = 0; i < n; i++) {
			temp[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			temp[array[i] - 1] = 1;
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (temp[i] == 0) {
				ans = i + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int n = arr.length;
		missingNumber(arr, n);
		System.out.println(missingNumber(arr, n));
	}

}
