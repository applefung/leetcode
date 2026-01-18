package com.leetcode;

public class LongestEvenOddSubarrayWithThreshold {
    public int longestAlternatingSubarray2(int[] nums, int threshold) {
        int windowSize = 0;
        for (int i = 0; i < nums.length; i++) {
            // start with the first even
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                boolean isOdd = true;
                int right = i + 1;
                while (right < nums.length && nums[right] % 2 == (isOdd ? 1 : 0) && nums[right] <= threshold) {
                    right++;
                    isOdd = !isOdd;
                }
                windowSize = Math.max(windowSize, right - i);
            }
        }
        return windowSize;
    }

    // sliding window approach
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLength = 0;
        int left = 0;
        
        while (left < nums.length) {
            // Find the next valid starting point (even number <= threshold)
            while (left < nums.length && (nums[left] % 2 != 0 || nums[left] > threshold)) {
                left++;
            }
            
            if (left >= nums.length) {
                break; // No more valid starting points
            }
            
            // Found a valid start, now expand the window
            int right = left;
            maxLength = Math.max(maxLength, 1); // At least one element
            
            // Expand window while maintaining alternating pattern
            while (right + 1 < nums.length) {
                int next = right + 1;
                // Check if next element continues the alternating pattern and is valid
                if (nums[next] % 2 != (nums[right] % 2) && nums[next] <= threshold) {
                    right = next;
                    maxLength = Math.max(maxLength, right - left + 1);
                } else {
                    // Pattern broken, move left to next potential start
                    break;
                }
            }
            
            // Move left to next position to find next valid window
            left = right + 1;
        }
        
        return maxLength;
    }
}
