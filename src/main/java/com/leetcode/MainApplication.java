package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		IntersectionOfTwoLinkedLists p = new IntersectionOfTwoLinkedLists();
		ListNode a = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5)))));
		ListNode b = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));
		ListNode result = p.getIntersectionNode(a, b);
		System.out.println("result==>"+result);

		SpringApplication.run(MainApplication.class, args);
	}

}
