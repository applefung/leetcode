package com.leetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char i: s.toCharArray()) {
            if(Character.isLetterOrDigit(i)) {
                sb.append(i);
            }
        }
        String data = sb.toString().toLowerCase();
        if(data.length() == 1) {
            return false;
        }
        int j=data.length() - 1;
        for(int i=0; i<data.length(); i++) {
            if(data.charAt(i) != data.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
