package com.leetcode;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int minDifference = nums[k-1] - nums[0];
        while(left<=nums.length-k) {
            int max = nums[left+k-1];
            int min = nums[left];
            minDifference = Math.min(minDifference, Math.abs(max - min));
            left++;
        }
        return minDifference;
    }
}
