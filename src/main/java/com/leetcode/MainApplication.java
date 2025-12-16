package com.leetcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		DuplicatedZeros duplicateZeros = new DuplicatedZeros();
		duplicateZeros.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
		// SpringApplication.run(MainApplication.class, args);
	}

}
