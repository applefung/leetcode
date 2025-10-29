package com.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while(left<right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int side = Math.min(leftHeight, rightHeight);
            int width = right - left;
            result = Math.max(result, side*width);
            if(leftHeight<rightHeight) {
                left++;
            }
            else {
                right--;
            }
        }
        return result;
    }
}
