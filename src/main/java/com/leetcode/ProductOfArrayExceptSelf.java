package com.leetcode;

import java.util.HashMap;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] result = new int[nums.length];
        HashMap<Integer, Integer> zeroPositions = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroPositions.put(i, nums[i]);
                continue;
            }
            product *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeroPositions.containsKey(i)) {
                if(zeroPositions.size() > 1) {
                    result[i] = 0;
                    continue;
                }
                result[i] = product;
                continue;
            }
            if(zeroPositions.size() > 0) {
                result[i] = 0;
                continue;
            }
            result[i] = product / nums[i];
        }
        return result;
    } 
}
