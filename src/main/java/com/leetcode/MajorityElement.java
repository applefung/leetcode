package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorTimes = nums.length/2;
        Map<Integer, Integer> count = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int curr = count.getOrDefault(nums[i], 0);
            curr++;
            count.put(nums[i], curr);
        }
        for(Integer key: count.keySet()) {
            if(count.get(key)>majorTimes) {
                return key;
            }
        }
        return 0;
    }
}
