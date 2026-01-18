package com.leetcode;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		LongestEvenOddSubarrayWithThreshold longestEvenOddSubarrayWithThreshold = new LongestEvenOddSubarrayWithThreshold();
		int[] nums = {8,10,7,8,3};
		int threshold = 8;
		int result = longestEvenOddSubarrayWithThreshold.longestAlternatingSubarray(nums, threshold);
		System.out.println("result: " + result);
	}
}
