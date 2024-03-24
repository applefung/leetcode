package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) {
            return new ArrayList<>();
        }
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }
}
