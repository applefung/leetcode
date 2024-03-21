package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return j;
    }
}
