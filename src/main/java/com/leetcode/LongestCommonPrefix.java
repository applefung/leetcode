package com.leetcode;

import java.util.Collections;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int strLen = strs.length;
        String[] reverseStr = new String[strLen];
        StringBuilder result = new StringBuilder();
        for(int i=0; i<strLen; i++) {
            StringBuilder sb = new StringBuilder(strs[i]);
            reverseStr[i] = sb.reverse().toString();
        }
        int longest = reverseStr[0].length();
        for(int i=1; i<reverseStr.length; i++){
            int tempLen = reverseStr[i].length();
            if(tempLen > longest) {
                longest = tempLen;
            }
        }
        boolean flag = false;
        for(int i=0; i<longest; i++) {
            if(strs[0].equals("")) {
                break;
            }
            if(i >= strs[0].length()) {
                break;
            }
            char temp = strs[0].charAt(i);
            for(int k=1; k<strLen; k++) {
                if(i >= strs[k].length() || strs[k].charAt(i)!= temp) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                break;
            }
            result.append(temp);
        }
        return result.toString();
    }
}
