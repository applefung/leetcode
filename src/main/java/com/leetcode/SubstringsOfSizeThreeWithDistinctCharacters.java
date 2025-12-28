package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }
        
        int windowSize = 3;
        int count = 0;
        Map<Character, Integer> window = new HashMap<>();
        
        // Initialize the first window
        for (int i = 0; i < windowSize; i++) {
            window.put(s.charAt(i), window.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        // Check the first window
        if (window.size() == 3) {
            count++;
        }
        
        // Slide the window
        for (int i = windowSize; i < s.length(); i++) {
            // Remove the leftmost character
            char leftChar = s.charAt(i - windowSize);
            int leftCount = window.get(leftChar);
            if (leftCount == 1) {
                window.remove(leftChar);
            } else {
                window.put(leftChar, leftCount - 1);
            }
            
            // Add the rightmost character
            char rightChar = s.charAt(i);
            window.put(rightChar, window.getOrDefault(rightChar, 0) + 1);
            
            // Check if current window has 3 distinct characters
            if (window.size() == 3) {
                count++;
            }
        }
        
        return count;
    }

    public int countGoodSubstrings2(String s) {
        int windowSize = 3;
        int count = 0;
        for(int i=0; i<=s.length()-windowSize; i++) {
            if(isGoodSubstring(s.substring(i, i+windowSize))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isGoodSubstring(String s) {
        Set<Character> set = new HashSet<>();
        for(Character character : s.toCharArray()) {
            set.add(character);
        }
        return set.size() == 3;
    }
}
