package com.leetcode;

import java.util.Arrays;

public class MinimumAverageOfSmallestAndLargestElements {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double[] averages = new double[nums.length/2];
        int index = 0;
        while(left < right) {
            double sum = (nums[left] + nums[right])/2.0;
            averages[index] = sum;
            index++;
            left++;
            right--;
        }
        Arrays.sort(averages);
        System.out.println("averages: " + Arrays.toString(averages));
        return averages[0];
    }
}
