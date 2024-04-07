package com.leetcode;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        String b = Integer.toBinaryString(n);
        int count = 0;
        for(char c: b.toCharArray()) {
            if(Integer.parseInt(String.valueOf(c)) ==1) {
                count++;
            }
        }
        return count;
    }
}
