package com.leetcode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aDummy = headA;
        ListNode bDummy = headB;
        while(aDummy != null) {
            bDummy = headB;
            while (bDummy != null) {
                if(aDummy == bDummy) {
                    return aDummy;
                }
                bDummy = bDummy.next;
            }
            aDummy = aDummy.next;
        }
        return null;
    }
}
