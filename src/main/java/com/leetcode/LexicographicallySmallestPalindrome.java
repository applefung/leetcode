package com.leetcode;

public class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                chars[left] = (char) Math.min(s.charAt(left), s.charAt(right));
                chars[right] = (char) Math.min(s.charAt(left), s.charAt(right));
            }
            left++;
            right--;
        }
        return new String(chars);
    }
}
