package com.leetcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		// Build linked list 1 -> 2 -> 2 -> 1
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		PalindromeLinkedList checker = new PalindromeLinkedList();
		System.out.println(checker.isPalindrome(n1));
		// SpringApplication.run(MainApplication.class, args);
	}

}
