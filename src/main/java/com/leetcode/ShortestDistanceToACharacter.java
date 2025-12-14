package com.leetcode;

public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result[i] = 0;
                right = i;
                for(int j = left; j < right; j++) {
                    // need to compare both left and right
                    if(left > 0) {
                        int leftDistance = j - left + 1;
                        int rightDistance = right - j;
                        result[j] = leftDistance > 0 ? Math.min(rightDistance, leftDistance) : rightDistance;
                    }
                    else {
                        result[j] = right - j;
                    }
                }
                left = i + 1;
            }
            else {
                // right side and not found the next character
                if (left > 0) {
                    result[i] = i - right;
                }
            }
        }
        return result;
    }
}
