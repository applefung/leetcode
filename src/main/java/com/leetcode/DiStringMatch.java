package com.leetcode;

public class DiStringMatch {
    public static int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int min = 0;
        int max = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                result[i] = min;
                min++;
            }
            else {
                result[i] = max;
                max--;
            }
        }
        result[s.length()] = s.charAt(s.length() - 1) == 'I' ? min : max;
        return result;
    }
}
