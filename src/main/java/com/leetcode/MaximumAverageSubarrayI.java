package com.leetcode;

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int maxSum = 0;
        // init with first k elements
        for(int i=0; i<k; i++) {
            maxSum += nums[i];
        }
        while(left<=nums.length-k) {
            int sum = 0;
            for(int i=left; i<left+k; i++) {
                sum += nums[i];
            }
            maxSum = Math.max(maxSum, sum);
            left++;
        }
        double result = maxSum / (double)k;
        return result;
    }
}
