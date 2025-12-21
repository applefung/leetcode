package com.leetcode;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ApplyOperationsToAnArray applyOperationsToAnArray = new ApplyOperationsToAnArray();
		int[] result = applyOperationsToAnArray.applyOperations(new int[]{1,2,2,1,1,0});
		System.out.println("result: " + Arrays.toString(result));
	}
}
