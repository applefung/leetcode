package com.leetcode;

import java.util.*;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            list.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            list.add(nums2[i]);
        }
        int half = list.size()/2;
        Collections.sort(list);
        if(list.size() % 2 == 1) {
            return list.get(half);
        }
        return (double) (list.get(half - 1)+list.get(half))/2;
    }
}
