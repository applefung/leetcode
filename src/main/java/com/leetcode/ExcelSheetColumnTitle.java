package com.leetcode;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        int data = columnNumber - 1;
        int divider = data/26;
        int remainder = data%26;
        StringBuilder sb = new StringBuilder();
        sb.append((char)(remainder+65));
        while(divider!=0) {
            sb.append((char)(((divider-1)%26)+65));
            divider = (divider-1)/26;
        }
        return sb.reverse().toString();
    }
}
