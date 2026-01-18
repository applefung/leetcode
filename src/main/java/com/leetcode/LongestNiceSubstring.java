package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static String longestNiceSubstring(String s) {
        char[] characters = s.toCharArray();
        int windowSize = 2;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=characters.length-windowSize; i++) {
            if(characters.length - i < windowSize) {
                break;
            }
            String window = "";
            while(i + windowSize <= characters.length) {
                window = new String(characters, i, windowSize);
                if(isNice(window) && windowSize > sb.length()) {
                    sb.replace(0, windowSize, window);
                }
                windowSize++;
            }
            windowSize=2;
        }
        return sb.length() > 0 ? sb.toString() : "";
    }

    private static boolean isNice(String window) {
        char[] characters = window.toCharArray();
        Set<Character> set = new HashSet<>();
        for(Character character : characters) {
            set.add(character);
        }
        for(Character character : set) {
            if(!set.contains(Character.toUpperCase(character)) || !set.contains(Character.toLowerCase(character))) {
                return false;
            }
        }
        return true;
    }

    // sliding window approach
    public static String longestNiceSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        int maxLeft = 0;
        int maxLength = 0;
        
        for (int left = 0; left < s.length(); left++) {
            Set<Character> set = new HashSet<>();
            for (int right = left; right < s.length(); right++) {
                set.add(s.charAt(right));
                
                // Check if current window [left, right] is nice
                if (isNiceWindow(set)) {
                    int currentLength = right - left + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        maxLeft = left;
                    }
                }
            }
        }
        
        return maxLength > 0 ? s.substring(maxLeft, maxLeft + maxLength) : "";
    }
    
    private static boolean isNiceWindow(Set<Character> set) {
        for (Character c : set) {
            char upper = Character.toUpperCase(c);
            char lower = Character.toLowerCase(c);
            if (!set.contains(upper) || !set.contains(lower)) {
                return false;
            }
        }
        return true;
    }
}
