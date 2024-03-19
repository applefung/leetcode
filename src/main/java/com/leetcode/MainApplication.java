package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		LongestPalindrome x = new LongestPalindrome();
		String size = x.longestPalindrome("aaaaa");
		System.out.println("result==="+size);
		SpringApplication.run(MainApplication.class, args);
	}

}
