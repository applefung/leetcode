package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		FindMedianSortedArrays x = new FindMedianSortedArrays();
		double size = x.findMedianSortedArrays(new int[]{1,3}, new int[]{2,3});
		System.out.println("result==="+size);
		SpringApplication.run(MainApplication.class, args);
	}

}
