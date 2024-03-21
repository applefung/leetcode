package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		MergeTwoLists x = new MergeTwoLists();
		ListNode l1 = new ListNode();
//		ListNode l1 = new ListNode(1);
//		ListNode l11 = new ListNode(4);
//		l1.next = new ListNode(2, l11);

		ListNode l2 = new ListNode();
//		ListNode l2 = new ListNode(1);
//		ListNode l22 = new ListNode(3);
//		l2.next = new ListNode(4,l22);

		ListNode size = x.mergeTwoLists(l1, l2);
		while (size != null) {
			System.out.println(size.val);
			size = size.next;
		}
		SpringApplication.run(MainApplication.class, args);
	}

}
