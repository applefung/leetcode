package com.leetcode;

import java.util.Arrays;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i = 0; i < arr1.length; i++) {
            if(isValid(arr2, arr1[i], d)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isValid(int[] arr2, int target, int d) {
        int left = 0;
        int right = arr2.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.abs(arr2[mid] - target) <= d) {
                return false;
            }
            else if(arr2[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return true;
    }
}
