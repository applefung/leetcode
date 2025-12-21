package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Collections.sort(list);
        int left = 0;
        int right = list.size() - 1;
        while(left < right) {
            int sum = list.get(left) + list.get(right);
            if(sum == 0) {
                return list.get(right);
            }
            else if(sum < 0) {
                left++;
            }
            else {
                right--;
            }
        }
        return -1;
    }
}
