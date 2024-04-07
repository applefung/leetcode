package com.leetcode;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i=0; i<columnTitle.length(); i++) {
            int remainder = (int)(columnTitle.charAt(i)) - 64;
            result=remainder+26*result;
        }
        return result;
    }
}
