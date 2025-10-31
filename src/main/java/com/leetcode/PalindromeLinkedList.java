package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        ListNode temp = head;
        while (temp!=null) {
            nums.add(temp.val);
            temp = temp.next;
        }
        int start = 0;
        int end = nums.size() - 1;
        while (start < end) {
            if(nums.get(start)!=nums.get(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
