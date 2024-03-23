package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> dataSet = new HashSet<>();
        ListNode temp = head;
        while(temp != null) {
            dataSet.add(temp.val);
            temp = temp.next;
        }
        System.out.println("dataSet" +dataSet);
        List<Integer> sortedData = new ArrayList<>(dataSet);
        Collections.sort(sortedData);
        ListNode result = new ListNode();
        ListNode dummy = result;
        for(int i=0; i<sortedData.size(); i++) {
            result.next = new ListNode(sortedData.get(i));
            result = result.next;
        }
        return dummy.next;
    }
}
