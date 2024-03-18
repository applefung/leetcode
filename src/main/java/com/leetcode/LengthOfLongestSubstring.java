package com.leetcode;

import static java.lang.Character.isLetter;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0;
        int endIndex = 0;
        boolean[] visited = new boolean[256];
        int maxLength = 0;
        if(s.equals("")){
            return 0;
        }
        if(s.isBlank()){
            return 1;
        }
        while (endIndex<s.length()) {
            if(visited[s.charAt(endIndex)]) {
                while (visited[s.charAt(endIndex)]) {
                    visited[s.charAt(startIndex)] = false;
                    startIndex++;
                }
            }
            visited[s.charAt(endIndex)] = true;
            maxLength = Math.max(maxLength, (endIndex - startIndex + 1));
            endIndex++;
        }
        return maxLength;
    }
}
