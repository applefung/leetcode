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

    public int divisorSubstrings2(int num, int k) {
        String numString = String.valueOf(num);
        int count = 0;
        for(int i=0; i<numString.length(); i++) {
            if(i+k > numString.length()) {
                break;
            }
            int windowInt = Integer.parseInt(numString.substring(i, i+k));
            if(windowInt != 0 && num % windowInt == 0) {
                count++;
            }
        }
        return count;
    }
}
