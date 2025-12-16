package com.leetcode;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] result = new char[s.length()];
        while (left <= right) { 
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            boolean isLeftLetter = Character.isLetter(leftChar);
            boolean isRightLetter = Character.isLetter(rightChar);
            if (isLeftLetter && isRightLetter) {
                result[left] = rightChar;
                result[right] = leftChar;
                left++;
                right--;
            }
            if (!isLeftLetter) {
                result[left] = leftChar;
                left++;
            }
            if (!isRightLetter) {
                result[right] = rightChar;
                right--;
            }
        }
        return new String(result);
    }
}
