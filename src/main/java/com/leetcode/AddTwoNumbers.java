package com.leetcode;


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempAnswer = new ListNode();
        //  Point to the header of the answer
        ListNode answer = tempAnswer;
        ListNode currL1 = new ListNode(l1.val, l1.next);
        ListNode currL2 = new ListNode(l2.val, l2.next);
        int carry = 0;
        while(currL1 != null || currL2 != null) {
            int l1Value = currL1 != null ? currL1.val : 0;
            int l2Value = currL2 != null ? currL2.val : 0;
            int sum = l1Value + l2Value + carry;
            if(sum >=10) {
                sum = sum - 10;
                carry = 1;
            }
            else {
                carry = 0;
            }

            tempAnswer.next = new ListNode(sum);
            tempAnswer = tempAnswer.next;

            if(currL1 != null) {
                currL1 = currL1.next != null ? currL1.next : null;
            }

            if(currL2 != null) {
                currL2 = currL2.next != null ? currL2.next : null;
            }

            if(carry > 0) {
                tempAnswer.next = new ListNode(carry);
            }
        }
        return answer.next;
    }
}
