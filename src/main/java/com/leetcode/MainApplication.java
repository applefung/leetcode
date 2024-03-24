package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		MaximumDepthOfBinaryTree x = new MaximumDepthOfBinaryTree();
		TreeNode p = new TreeNode(-8,  new TreeNode(-6, new TreeNode(6, null, new TreeNode(5)), null), new TreeNode(7, null, null));
		int result = x.maxDepth(p);
		System.out.println("result==>"+result);

		SpringApplication.run(MainApplication.class, args);
	}

}
