package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		LongestCommonPrefix x = new LongestCommonPrefix();
		String size = x.longestCommonPrefix(new String[]{"flower","flower","flower","flower"});
		System.out.println("result==="+size);
		SpringApplication.run(MainApplication.class, args);
	}

}
