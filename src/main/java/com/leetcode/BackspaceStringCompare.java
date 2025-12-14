package com.leetcode;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        // remove the backspaces from the strings
        String s1 = removeBackspaces(s);
        String t1 = removeBackspaces(t);
        int firstS = 0;
        int firstT = 0;
        if(s1.length() != t1.length()) {
            return false;
        }
        while (firstS < s1.length() && firstT < t1.length()) {
            if (s1.charAt(firstS) != t1.charAt(firstT)) {
                return false;
            }
            firstS++;
            firstT++;
        }
        return true;
    }

    public static String removeBackspaces(String s) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                int index = j-1 < 0 ? 0 : j-1;
                sb.delete(index, j+1);
                j=j-(j-index);
            }
            else {
                sb.append(s.charAt(i));
                j++;
            }
        }
        return sb.toString();
    }
}
