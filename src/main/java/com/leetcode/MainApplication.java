package com.leetcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		MoveZeroes moveZeroes = new MoveZeroes();
		moveZeroes.moveZeroes2(new int[]{1,0,1});
		// SpringApplication.run(MainApplication.class, args);
	}

}
