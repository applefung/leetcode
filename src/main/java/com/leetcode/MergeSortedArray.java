package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        List<Integer> data = new ArrayList<>();
        for(int i=m; i<nums1.length; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        for(int i=0; i<nums1.length; i++) {
            data.add(nums1[i]);
        }
        Collections.sort(data);
        for(int i=0; i<nums1.length; i++) {
            nums1[i] = data.get(i);
        }
    }
}
