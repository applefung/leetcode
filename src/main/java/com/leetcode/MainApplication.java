package com.leetcode;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		FlipSquareSubmatrixVertically minimumAverageOfSmallestAndLargestElements = new FlipSquareSubmatrixVertically();
		int[][] result = minimumAverageOfSmallestAndLargestElements.reverseSubmatrix(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}, 1, 0, 3);
		System.out.println("result: " + Arrays.deepToString(result));
	}
}
