package com.leetcode;

public class MaximumEnemyFortsThatCanBeCaptured {
    public int captureForts(int[] forts) {
        int result = 0;
        int left = 0;
        int right = forts.length - 1;
        int previousNumber = 0;
        for(int i = 0; i < forts.length; i++) {
            if(forts[i] == 1) {
                left = right != 0 ? right : 0;
                right = i;
                if(previousNumber == -1) {
                    result = Math.max(result, right - left - 1);
                }
                previousNumber = 1;
            }
            if(forts[i] == -1) {
                left = right != 0 ? right : 0;
                right = i;
                if(previousNumber == 1) {
                    result = Math.max(result, right - left - 1);
                }
                previousNumber = -1;
            }
        }
        return result;
    }
}
