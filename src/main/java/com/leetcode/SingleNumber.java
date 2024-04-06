package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int count = countMap.getOrDefault(nums[i], 0);
            count++;
            countMap.put(nums[i], count);
        }
        int result = 0;
        for(Integer key: countMap.keySet()){
            if(countMap.get(key)==1){
                result = key;
            }
        }
        return result;
    }
}
