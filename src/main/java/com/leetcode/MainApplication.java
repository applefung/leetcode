package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		IsSameTree x = new IsSameTree();
		TreeNode p = new TreeNode(10,  new TreeNode(5), new TreeNode(15));
		TreeNode q = new TreeNode(1, new TreeNode(5, null, null), new TreeNode(15, null, new TreeNode(3)));
		boolean result = x.isSameTree(p, q);
		System.out.println("result==>"+result);

		SpringApplication.run(MainApplication.class, args);
	}

}
