package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		RemoveDuplicateLetters x = new RemoveDuplicateLetters();
		System.out.println(x.removeDuplicateLetters("bcabc"));
		SpringApplication.run(MainApplication.class, args);
	}

}
