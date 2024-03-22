package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		AddBinary x = new AddBinary();

		String size = x.addBinary("100", "110010");
		System.out.println("result===>" + size);
		SpringApplication.run(MainApplication.class, args);
	}

}
