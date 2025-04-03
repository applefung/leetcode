package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> numsList = new ArrayList<>();
        int[] answer = new int[2];
        for(int i: nums) {
            numsList.add(i);
        }

        for(int i= 0; i<nums.length; i++) {
            int current = nums[i];
            int complement = target - current;
            int complementIndex = numsList.indexOf(complement);

            if (numsList.contains(complement) && i != complementIndex) {
                answer[0] = i;
                answer[1] = complementIndex;
                break;
            }
        }
        return answer;
    }

}
