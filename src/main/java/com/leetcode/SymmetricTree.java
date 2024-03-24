package com.leetcode;

public class SymmetricTree {
    public boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null && right != null) {
            return false;
        }
        if(left != null && right == null) {
            return false;
        }
        if(left.val != right.val) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }
}
