package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        // Convert to list and sort
        List<Integer> numList = new ArrayList<Integer>();
        for(int num : nums) {
            numList.add(num);
        }
        Collections.sort(numList);

        int longest = 1;
        int currentLength = 1;

        for (int i = 1; i < numList.size(); i++) {
            int diff = numList.get(i) - numList.get(i-1);
            if (diff == 1) {
                currentLength++;
                longest = Math.max(longest, currentLength);
            } 
            else if (diff > 1) {
                currentLength = 1;
            }
        }

        return longest;
    }
}
