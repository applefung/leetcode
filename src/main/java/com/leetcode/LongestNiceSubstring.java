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
}
