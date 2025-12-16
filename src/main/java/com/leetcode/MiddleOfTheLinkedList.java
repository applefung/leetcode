package com.leetcode;

import java.util.Stack;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        search(head, stack);
        int size = stack.size();
        int middle = size / 2;
        int middleIndex = size % 2 == 0 ? middle - 1 : middle;
        for (int i = 0; i < middleIndex; i++) {
            stack.pop();
        }
        return stack.pop();
    }

    private void search(ListNode node, Stack<ListNode> stack) {
        if (node == null) {
            return;
        }
        stack.push(node);
        search(node.next, stack);
    }
}
