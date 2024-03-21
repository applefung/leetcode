package com.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                temp[index] = nums[i];
                index++;
            }
        }
        for(int i=0; i<temp.length; i++){
            nums[i] = temp[i];
        }
        return index;
    }
}
