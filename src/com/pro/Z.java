package com.pro;

public class Z {

	public static void main(String args[]) {
		int arr[] = { 12, 66, 44, 43, 32, 2, 44, 78, 9 };
		int max = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (max < arr[i]) {
					max = arr[i];
				}

				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println("min number is " + temp);
		System.out.println("max number is " + max);
	}
}
