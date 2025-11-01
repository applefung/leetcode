package com.leetcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		IsSubsequence isSubsequence = new IsSubsequence();
		System.out.println(isSubsequence.isSubsequence("abc", "ahbgdc"));
		// SpringApplication.run(MainApplication.class, args);
	}

}
