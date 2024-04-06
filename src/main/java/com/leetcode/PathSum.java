package com.leetcode;

public class PathSum {
    public boolean pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        boolean left = pathSum(root.left, targetSum - root.val);
        boolean right = pathSum(root.right, targetSum - root.val);
        return left || right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root, targetSum);
    }
}
