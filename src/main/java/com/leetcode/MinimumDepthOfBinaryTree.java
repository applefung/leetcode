package com.leetcode;

public class MinimumDepthOfBinaryTree {
    public int getMinDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        if(root.left == null) {
            return minDepth(root.right)+1;
        }
        if(root.right == null) {
            return minDepth(root.left)+1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return Math.min(left, right)+1;
    }
    public int minDepth(TreeNode root) {
        return getMinDepth(root);
    }
}
