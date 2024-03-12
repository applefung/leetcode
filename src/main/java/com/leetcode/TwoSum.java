package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        List<Integer> numsList = new ArrayList<>();
        for(int i: nums) {
            numsList.add(i);
        }

        for(int i=0; i<numsList.size(); i++){
            int a = numsList.get(i);
            int tempB = target - a;
            int tempBIndex = numsList.indexOf(tempB);;
            if(numsList.contains(tempB) && tempBIndex!=i) {
                answer[0] = i;
                answer[1] = tempBIndex;
                break;
            }
        }
        return answer;
    }
}
