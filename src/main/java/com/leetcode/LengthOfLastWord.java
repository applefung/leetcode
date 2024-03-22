package com.leetcode;

import java.util.List;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] data = s.split(" ");
        return data[data.length-1].length();
    }
}
