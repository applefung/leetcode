package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwo2DArraysBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();
        int nums1Index = 0;
        int nums2Index = 0;
        while(nums1Index<nums1.length && nums2Index<nums2.length) {
            if(nums1[nums1Index][0] == nums2[nums2Index][0]) {
                result.add(new int[]{nums1[nums1Index][0], nums1[nums1Index][1] + nums2[nums2Index][1]});
                nums1Index++;
                nums2Index++;
            }
            else if(nums1[nums1Index][0] < nums2[nums2Index][0]) {
                result.add(new int[]{nums1[nums1Index][0], nums1[nums1Index][1]});
                nums1Index++;
            }
            else {
                result.add(new int[]{nums2[nums2Index][0], nums2[nums2Index][1]});
                nums2Index++;
            }       
        }
        while(nums1Index<nums1.length) {
            result.add(new int[]{nums1[nums1Index][0], nums1[nums1Index][1]});
            nums1Index++;
        }
        while(nums2Index<nums2.length) {
            result.add(new int[]{nums2[nums2Index][0], nums2[nums2Index][1]});
            nums2Index++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
