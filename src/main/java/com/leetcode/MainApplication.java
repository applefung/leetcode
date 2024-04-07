package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ExcelSheetColumnNumber p = new ExcelSheetColumnNumber();
		int result = p.titleToNumber("AAY");
		System.out.println("result==>"+result);

		SpringApplication.run(MainApplication.class, args);
	}

}
