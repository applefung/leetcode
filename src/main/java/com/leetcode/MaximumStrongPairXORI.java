package com.leetcode;

import java.util.Arrays;

public class MaximumStrongPairXORI {
    public int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int maxXOR = 0;
        int n = nums.length;
        
        // Check same-element pairs first (all are valid strong pairs)
        for (int i = 0; i < n; i++) {
            maxXOR = Math.max(maxXOR, nums[i] ^ nums[i]); // Always 0, but for completeness
        }
        
        // Use sliding window to check different-element pairs
        int left = 0;
        for (int right = 1; right < n; right++) {
            // Shrink window from left while condition is violated
            while (left < right && nums[right] - nums[left] > nums[left]) {
                left++;
            }
            
            // Check all pairs in current valid window
            // Since nums is sorted, all pairs (nums[i], nums[right]) where i in [left, right] are valid
            for (int i = left; i < right; i++) {
                if (nums[right] - nums[i] <= nums[i]) {
                    maxXOR = Math.max(maxXOR, nums[right] ^ nums[i]);
                }
            }
        }
        
        return maxXOR;
    }
}
