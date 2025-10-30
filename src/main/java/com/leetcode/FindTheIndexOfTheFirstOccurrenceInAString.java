package com.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // 2 pointer: sliding window
    public int strStr2(String haystack, String needle) {
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        int n = haystackArray.length;
        int m = needleArray.length;
        for (int i=0; i<=n-m; i++) {
            int j=0;
            while (j<m && haystackArray[i+j] == needleArray[j]){
                j++;
            }
            if(j==m) {
                return i;
            }
        }
        return -1;
    }
}
