package com.leetcode;

public class FindIndicesWithIndexAndValueDifferenceI {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        if(indexDifference == 0 && valueDifference == 0 && nums.length == 1) {
            return new int[] {0, 0};
        }
        for (int i = 0; i < nums.length; i++) {
            int left = i;
            int right = nums.length - 1;
            while(left < right) {
                if(Math.abs(i - left) >= indexDifference && Math.abs(nums[i] - nums[left]) >= valueDifference) {
                    return new int[] {left, i};
                }
                if(Math.abs(i - right) >= indexDifference && Math.abs(nums[i] - nums[right]) >= valueDifference) {
                    return new int[] {right, i};
                }
                if(nums[left] < nums[right]) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new int[] {-1, -1};
    }
}
