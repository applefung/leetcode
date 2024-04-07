package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ExcelSheetColumnTitle p = new ExcelSheetColumnTitle();
		String result = p.convertToTitle(701);
		System.out.println("result==>"+result);

		SpringApplication.run(MainApplication.class, args);
	}

}
