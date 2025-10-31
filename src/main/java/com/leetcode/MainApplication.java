package com.leetcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ReverseVowelsOfString reverseVowelsOfString = new ReverseVowelsOfString();
		System.out.println(reverseVowelsOfString.reverseVowels("IceCreAm"));
		// SpringApplication.run(MainApplication.class, args);
	}

}
