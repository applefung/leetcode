package com.leetcode;

public class LongestEvenOddSubarrayWithThreshold {
    public int longestAlternatingSubarray2(int[] nums, int threshold) {
        int windowSize = 0;
        for(int i=0; i<nums.length; i++) {
            // start with the first even
            if(nums[i] % 2 == 0 && nums[i] <= threshold) {
                boolean isOdd = true;
                int right = i + 1;
                while(right < nums.length && nums[right] % 2 == (isOdd ? 1 : 0) && nums[right] <= threshold) {
                    right++;
                    isOdd = !isOdd;
                }
                windowSize = Math.max(windowSize, right - i);
            }
        }
        return windowSize;
    }
}
