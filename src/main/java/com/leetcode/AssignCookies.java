package com.leetcode;

import java.util.Arrays;

public class AssignCookies {
    //  2 pointer
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childIndex = 0;
        int cookieIndex = 0;
        int result = 0;
        while (childIndex<g.length && cookieIndex<s.length) {
            if(g[childIndex] <= s[cookieIndex]) {
                result++;
                childIndex++;
                cookieIndex++;
            }
            else if(g[childIndex] > s[cookieIndex]) {
                cookieIndex++;
            }
        }
        return result;
    }
}
