package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SearchInsert x = new SearchInsert();

		int size = x.searchInsert(new int[]{1,3,5,6}, 2);
		System.out.println("result==>"+size);
		SpringApplication.run(MainApplication.class, args);
	}

}
