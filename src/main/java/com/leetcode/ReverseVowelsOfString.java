package com.leetcode;

public class ReverseVowelsOfString {
    // 2 pointer
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();
        while(start<end) {
            char startChar = chars[start];
            char endChar = chars[end];
            if(!isVowel(startChar)) {
                start++;
                continue;
            }
            if(!isVowel(endChar)) {
                end--;
                continue;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
