package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllKDistantIndicesInAnArray {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int left = 0;
        int right = 0;
        boolean isZeroIndex = false;
        Set<Integer> resultSet = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == key) {
                if(i == 0) {
                    isZeroIndex = true;
                }
                left = right == 0 ? 0 : right;
                right = i;
                for(int j = left; j < right; j++) {
                    int data = 0;
                    int leftDistance = Math.abs(j-left);
                    int rightDistance = Math.abs(right-j);
                    if(left == 0 && !isZeroIndex) {
                        data = Math.abs(rightDistance);
                    }
                    else {
                        data = Math.min(leftDistance, rightDistance);
                    }
                    if(data <= k) {
                        resultSet.add(j);
                    }
                }
            }
        }
        for(int i = right; i < nums.length; i++) {
            if(Math.abs(i-right) <= k) {
                resultSet.add(i);
            }
        }
        result.addAll(resultSet);
        Collections.sort(result);
        return result;
    }
}
