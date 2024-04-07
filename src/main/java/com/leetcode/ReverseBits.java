package com.leetcode;

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;   // Initialize a variable to store the final answer.
        for(int i=0;i<32;i++){   // Loop through each bit position in the 32-bit integer.
            int lsb = 0; // Initialize a variable to store the least significant bit (lsb) of the reversed number.
            if(((n>>i)&1)==1){   // Check if the ith bit of n is set (1).
                lsb = 1<<31-i; // If the ith bit is set, calculate the position of the corresponding bit in the reversed number.
                ans = ans | lsb;   // Use the bitwise OR operator to set the corresponding bit in the answer.
            }
        }
        return ans;   // Return the reversed number.
    }
}
