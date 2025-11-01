package com.leetcode;

public class ReverseString3 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String[] results = new String[words.length];
        for(int i=0; i<words.length; i++) {
            char[] chars = words[i].toCharArray();
            int start=0;
            int end=chars.length-1;
            while(start<end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
            results[i] = new String(chars);
        }
        return String.join(" ", results);
    }
}
