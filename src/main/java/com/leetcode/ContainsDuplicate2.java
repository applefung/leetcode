package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 0;
        Set<Integer> set = new HashSet<>();
        while(left < nums.length && right < nums.length) {
            if(set.contains(nums[right])) {
                if(right-left <= k) {
                    return true;
                }
                set.remove(nums[left]);
                left++;
            } else {
                set.add(nums[right]);
                right++;
            }
        }
        return false;
    }

    // hash map solution
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if(i-map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
