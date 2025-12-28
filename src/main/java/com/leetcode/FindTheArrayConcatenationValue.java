package com.leetcode;

public class FindTheArrayConcatenationValue {
    public long findTheArrayConcVal(int[] nums) {
        long concatenationValue = 0;
        for(int i = 0; i < nums.length/2; i++) {
            concatenationValue += Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[nums.length - i - 1]));
        }
        if(nums.length % 2 == 1) {
            concatenationValue += Long.parseLong(String.valueOf(nums[nums.length/2]));
        }
        return concatenationValue;
    }
}
