package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		MergeSortedArray x = new MergeSortedArray();
		int[] a = new int[]{4,5,6,0,0,0};
		int[] b = new int[]{2,5,6};
		x.merge(a, 3, b,  3);
		for(int i=0; i<a.length; i++) {
			System.out.println("result===>" + a[i]);
		}

		SpringApplication.run(MainApplication.class, args);
	}

}
