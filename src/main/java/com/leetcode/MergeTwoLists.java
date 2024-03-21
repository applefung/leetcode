package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> data = new ArrayList<>();
        if(list1 != null) {
            while(list1 != null) {
                data.add(list1.val);
                list1 = list1.next;
            }
        }

        if(list2 != null) {
            while(list2 != null) {
                data.add(list2.val);
                list2 = list2.next;
            }
        }
        Collections.sort(data);
        if(data.isEmpty()) {
            return new ListNode().next;
        }
        ListNode result = new ListNode();
        ListNode dummy = result;
        for(int i=0; i<data.size(); i++){
            result.next = new ListNode(data.get(i));
            result = result.next;
        }
        return dummy.next;
    }
}
