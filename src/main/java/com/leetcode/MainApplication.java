package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SingleNumber p = new SingleNumber();
		int result = p.singleNumber(new int[]{4,1,2,1,2});
		System.out.println("result==>"+result);

		SpringApplication.run(MainApplication.class, args);
	}

}
