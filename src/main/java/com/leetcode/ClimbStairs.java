package com.leetcode;

public class ClimbStairs {
    public int climbStairs(int n) {
        // fibonacci number
        // 1: 1, 2: 2, 3: 3, 4: 5, 5: 8
        int prev = 0;
        int curr = 1;
        int temp = 0;
        for(int i=0; i<n; i++) {
            temp = curr;
            curr = curr + prev;
            prev = temp;
        }
        return curr;
    }
}
