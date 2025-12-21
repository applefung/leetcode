package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            int left = i;
            int right = nums.length - 1;
            while(left < right) {
                int difference = nums[right] - nums[left];
                if(difference == diff) {
                    if(set.contains(left)) {
                        count++;
                    }
                    set.add(left);
                    set.add(right);
                    left++;
                    right--;
                    continue;
                }
                else if(difference < diff) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return count;
    }
}
