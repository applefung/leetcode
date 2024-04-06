package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStock p = new BestTimeToBuyAndSellStock();
		int result = p.maxProfit(new int[] {7,1,5,3,6,4});
		System.out.println("result==>"+result);

		SpringApplication.run(MainApplication.class, args);
	}

}
