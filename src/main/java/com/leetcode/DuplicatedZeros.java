package com.leetcode;

public class DuplicatedZeros {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Step 1: Count zeros that will fit in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        // Step 2: Write from right to left
        int i = n - 1;  // Read pointer (original data)
        int j = n + zeros - 1;  // Write pointer (where to write after duplication)

        while (i >= 0 && j >= 0) {
            // Non-zero: just copy it
            if (arr[i] != 0) {
                if (j < n) {
                    arr[j] = arr[i];
                }
            } 
            // Zero: duplicate it
            else {
                if (j < n) {
                    arr[j] = 0;
                }
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }
}
