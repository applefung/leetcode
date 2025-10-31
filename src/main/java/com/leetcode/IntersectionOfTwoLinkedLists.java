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

    // 2 pointer
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        while(dummyA != dummyB){
            if(dummyA == dummyB) {
                return dummyA;
            }
            if(dummyA == null) {
                dummyA = headB;
            }
            if(dummyB == null) {
                dummyB = dummyA;
            }
            dummyA = dummyA.next;
            dummyB = dummyB.next;
        }
        return null;
    }
}
