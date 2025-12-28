package com.leetcode;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        // initialize count with the first window
        String window = blocks.substring(0, k);
        for(int j=0; j<window.length(); j++) {
            if(window.charAt(j) == 'W') {
                count++;
            }
        }
        for (int i=1; i<=blocks.length()-k; i++) {
            String innerWindow = blocks.substring(i, i+k);
            int currentCount = 0;
            for(int j=0; j<innerWindow.length(); j++) {
                if(innerWindow.charAt(j) == 'W') {
                    currentCount++;
                }
            }
            count = Math.min(count, currentCount);
        }
        return count;
    }
}
