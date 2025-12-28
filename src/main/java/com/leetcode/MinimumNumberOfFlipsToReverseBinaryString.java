package com.leetcode;

public class MinimumNumberOfFlipsToReverseBinaryString {
    public int minimumFlips(int n) {
        String binaryString = Integer.toBinaryString(n);
        int left = 0;
        int right = binaryString.length() - 1;
        int flips = 0;
        while(left < right) {
            if(binaryString.charAt(left) != binaryString.charAt(right)) {
                flips+=2;
            }
            left++;
            right--;
        }
        return flips;
    }
}
