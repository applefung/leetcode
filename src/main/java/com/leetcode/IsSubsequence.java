package com.leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] targets = s.toCharArray();
        char[] chars = t.toCharArray();
        int j=0;
        for(int i=0; i<chars.length; i++) {
            if(j==s.length()) {
                return true;
            }
            if(chars[i] == targets[j]) {
                j++;
            }
        }
        return false;
    }
}
