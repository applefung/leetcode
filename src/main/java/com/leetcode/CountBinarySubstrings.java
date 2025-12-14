package com.leetcode;

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int prevGroup = 0;  // Count of previous group
        int currGroup = 1;  // Count of current group
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                // Same character, extend current group
                currGroup++;
            } else {
                // Different character, start new group
                // Count valid substrings = min of two adjacent groups
                count += Math.min(prevGroup, currGroup);
                prevGroup = currGroup;
                currGroup = 1;
            }
        }

        // Don't forget the last pair!
        count += Math.min(prevGroup, currGroup);

        return count;
    }
}
