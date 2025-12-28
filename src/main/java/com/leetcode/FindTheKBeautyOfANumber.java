package com.leetcode;

public class FindTheKBeautyOfANumber {
    public int divisorSubstrings(int num, int k) {
        String numString = String.valueOf(num);
        int count = 0;
        for(int i=0; i<=numString.length()-k; i++) {
            String window = numString.substring(i, i+k);
            int windowInt = Integer.parseInt(window);
            if(windowInt != 0 && num % windowInt == 0) {
                count++;
            }
        }
        return count;
    }
}
