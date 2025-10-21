package com.leetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num: nums) {
            int currentCount = count.getOrDefault(num, 0);
            if (currentCount > 0) {
                return true;
            }
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
