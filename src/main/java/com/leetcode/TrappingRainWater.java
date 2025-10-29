package com.leetcode;

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 1;
        int right = height.length-2;
        int lMax = height[left-1];
        int rMax = height[right+1];
        int result = 0;
        while (left<=right) {
            if(rMax<=lMax) {
                result += Math.max(0, rMax - height[right]);
                rMax = Math.max(rMax, height[right]);
                right--;
            }
            else {
                result+=Math.max(0, lMax - height[left]);
                lMax = Math.max(lMax, height[left]);
                left++;
            }
        }
        return result;
    }
}
