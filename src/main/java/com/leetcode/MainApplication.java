package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		RemoveDuplicates x = new RemoveDuplicates();

		int size = x.removeDuplicates(new int[]{1,1,2});
		System.out.println("result==>"+size);
		SpringApplication.run(MainApplication.class, args);
	}

}
