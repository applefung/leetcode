package com.leetcode;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		MaximumLengthSubstringWithTwoOccurrences longestEvenOddSubarrayWithThreshold = new MaximumLengthSubstringWithTwoOccurrences	();
		int result = longestEvenOddSubarrayWithThreshold.maximumLengthSubstring("bcbbbcba");
		System.out.println("result: " + result);
	}
}
