package com.logic;

public class TwoSum {
	public static int lengthOfLongestSubstring(String s) {
		int var = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					var = j;
				}
			}
		}

		return var;
	}

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcabc"));

	}
}
