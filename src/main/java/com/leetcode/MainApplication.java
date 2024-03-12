package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		TwoSum x = new TwoSum();
		int[] answer = x.twoSum(new int[]{3,2,4}, 6);
		for(int i: answer) {
			System.out.println(i);
		}
		SpringApplication.run(MainApplication.class, args);
	}

}
