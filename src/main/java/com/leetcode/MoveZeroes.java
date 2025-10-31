package com.leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==0) {
                for(int j=i; j<nums.length; j++) {
                    if(nums[j] != 0){
                        nums[i]=nums[j];
                        nums[j]=0;
                        break;
                    }
                }
            }
        }
    }

    // 2 pointer 
    public void moveZeroes2(int[] nums) {
        int slow = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0){
                nums[slow] = nums[i];
                if(slow != i) {
                    nums[i]=0;
                }
                slow++;
            }
        }
    }
}
