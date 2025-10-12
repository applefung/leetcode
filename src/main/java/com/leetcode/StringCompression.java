package com.leetcode;

public class StringCompression {
    public String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i= 1; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            char previousChar = s.charAt(i-1);
            if(currentChar == previousChar) {
                count++;
            } else {
                sb.append(previousChar);
                sb.append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(count);
        return sb.toString();
    }
}
