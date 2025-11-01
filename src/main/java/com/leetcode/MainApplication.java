package com.leetcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ReverseString3 reverseString = new ReverseString3();
		System.out.println(reverseString.reverseWords("Let's take LeetCode contest"));
		// SpringApplication.run(MainApplication.class, args);
	}

}
