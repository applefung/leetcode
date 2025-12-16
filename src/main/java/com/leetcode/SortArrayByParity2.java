package com.leetcode;

public class SortArrayByParity2 {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0;  // Points to even positions: 0, 2, 4...
        int oddIndex = 1;   // Points to odd positions: 1, 3, 5...

        while (evenIndex < nums.length && oddIndex < nums.length) {
            // If even index has odd number AND odd index has even number
            if (nums[evenIndex] % 2 == 1 && nums[oddIndex] % 2 == 0) {
                // Swap them - fixes BOTH positions!
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
            }

            // Move even pointer if position is correct
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }

            // Move odd pointer if position is correct
            if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            }
        }

        return nums;
    }
}
