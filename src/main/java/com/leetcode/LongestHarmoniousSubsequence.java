package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        // Sliding Window Approach: MUST sort first!
        Arrays.sort(nums);

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            // While the difference between max and min in window > 1, shrink window
            while (nums[right] - nums[left] > 1) {
                left++;
            }

            // If difference is exactly 1, we have a valid harmonious subsequence
            if (nums[right] - nums[left] == 1) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            // If difference is 0, all elements in window are the same (not harmonious yet)
        }

        return maxLength;
    }

    public int findLHS2(int[] nums) {
        // Use HashMap to count frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // For each number, check if num+1 exists
        // If it does, the harmonious subsequence length is count[num] + count[num+1]
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                maxLength = Math.max(maxLength, map.get(num) + map.get(num + 1));
            }
        }

        return maxLength;
   }
}
