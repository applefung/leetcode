package com.leetcode;


public class CountIncremovableSubarraysI {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        
        // Find the start index of the longest increasing suffix
        int startIndex = n;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] >= nums[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        
        // If entire array is strictly increasing
        // startIndex remains n when no violation is found
        if (startIndex == n) {
            return n * (n + 1) / 2;
        }
        
        // Count valid removals
        // First, count all suffixes (removing prefix only)
        int ans = n - startIndex + 1;
        
        // Now try each valid prefix
        int j = startIndex;
        for (int i = 0; i < startIndex; i++) {
            // Check if prefix [0...i] is still strictly increasing
            if (i > 0 && nums[i] <= nums[i - 1]) {
                break; // Prefix is no longer strictly increasing
            }
            
            // Find the rightmost suffix that can be appended
            // We need nums[i] < nums[j] for the connection to be valid
            while (j < n && nums[i] >= nums[j]) {
                j++;
            }
            
            // All suffixes from j to n-1 are valid
            ans += n - j + 1;
        }
        
        return ans;
    }
}