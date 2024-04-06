package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		PascalsTriangle p = new PascalsTriangle();
		List<List<Integer>> result = p.generate(5);
		System.out.println("result==>"+result);

		SpringApplication.run(MainApplication.class, args);
	}

}
