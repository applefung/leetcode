package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaximumLengthSubstringWithTwoOccurrences {
    public int maximumLengthSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(left < s.length() && right < s.length()) {
            int count = map.getOrDefault(s.charAt(right), 0);
            if(count >= 2) {
                // Shrink window from left until we can add s.charAt(right)
                while(left < right) {
                    char leftChar = s.charAt(left);
                    map.put(leftChar, map.getOrDefault(leftChar, 0) - 1);
                    left++;
                    // Check if we can now add s.charAt(right)
                    if(map.getOrDefault(s.charAt(right), 0) < 2) {
                        break;
                    }
                }
            }
            // Add the current character
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
