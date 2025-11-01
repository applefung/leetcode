package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectioOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result =  new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int nums1Index = 0;
        int nums2Index = 0;
        while(nums1Index<nums1.length && nums2Index<nums2.length) {
            if(nums1[nums1Index] == nums2[nums2Index]) {
                result.add(nums1[nums1Index]);
                nums1Index++;
                nums2Index++;
            }
            else if(nums1[nums1Index]<nums2[nums2Index]){
                nums1Index++;
            }
            else {
                nums2Index++;
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}
