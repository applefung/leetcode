package com.leetcode;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        int divider = columnNumber;
        StringBuilder sb = new StringBuilder();
        while(divider!=0) {
            int remainder = (divider-1)%26;
            sb.append((char)((remainder)+65));
            divider = (divider-1)/26;
        }
        return sb.reverse().toString();
    }
}
