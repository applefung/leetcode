package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		FindTheIndexOfTheFirstOccurrenceInAString x = new FindTheIndexOfTheFirstOccurrenceInAString();

		int size = x.strStr("mississippi", "issip");
		System.out.println("result==>"+size);
		SpringApplication.run(MainApplication.class, args);
	}

}
