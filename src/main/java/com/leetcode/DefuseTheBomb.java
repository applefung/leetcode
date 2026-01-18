package com.leetcode;

public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        int absK = Math.abs(k);
        int sum = 0;
        int sum2 = 0;
        // init sum with first k elements
        for(int i=0; i<absK; i++) {
            sum += code[i];
        }
        // init sum2 with last k elements
        for(int i=code.length-1; i>=code.length-absK; i--) {
            sum2 += code[i];
        }

        if(k==0) {
            for(int i=0; i<code.length; i++) {
                result[i] = 0;
            }
        }
        if(k>0) {
            for(int i=0; i<code.length; i++) {
                sum -= code[i];
                // move the window to the right
                int right = i+absK;
                if(right >= code.length) {
                    right = right % code.length;
                }
                sum += code[right];
                result[i] = sum;
            }
        }
        if(k<0) {
            for(int i=0; i<code.length; i++) {
                result[i] = sum2;
                sum2 += code[i];
                // move the window to the left
                int left = i-absK;
                if(left < 0) {
                    left = left + code.length;
                }
                sum2 -= code[left];

            }
        }
        return result;
    }

    public int[] decrypt2(int[] code, int k) {
        int[] result = new int[code.length];
        // sliding window approach
        if(k==0) {
            for(int i=0; i<code.length; i++) {
                result[i] = 0;
            }
        }
        if(k>0) {
            // init window
            int sum = 0;
            for(int i=0; i<k; i++) {
                sum += code[i];
            }
            for(int i=0; i<code.length; i++) {
                sum -= code[i];
                // right pointer
                int right = (i+k) % code.length;
                sum += code[right];
                result[i] = sum;
            }
        }
        if(k<0) {
            // init window
            int sum = 0;
            int absK = Math.abs(k);
            for(int i=code.length-1; i>=code.length-absK; i--) {
                sum += code[i];
            }
            for(int i=0; i<code.length; i++) {
                result[i] = sum;
                sum += code[i];
                // left pointer
                int left = (i -absK + code.length) % code.length;
                sum -= code[left];
            }
        }
        return result;
    }
}
