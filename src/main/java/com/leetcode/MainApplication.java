package com.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		AddTwoNumbers x = new AddTwoNumbers();
		ListNode aMid1 = new ListNode(3);
		ListNode aMid2 = new ListNode(4, aMid1);
		ListNode a = new ListNode(2, aMid2);

		ListNode bMid1 = new ListNode(4);
		ListNode bMid2 = new ListNode(6, bMid1);
		ListNode b = new ListNode(5, bMid2);
		ListNode answer = x.addTwoNumbers(a, b);

		while(answer != null){
			System.out.println(answer.val);
			answer = answer.next;
		}
		SpringApplication.run(MainApplication.class, args);
	}

}
