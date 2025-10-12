package com.leetcode;

public class OneAway {
    public boolean oneAway(String s1, String s2) {
        if(s1.length() == s2.length()) {
            return oneEditReplace(s1, s2);
        } else if(s1.length() + 1 == s2.length()) {
            return oneEditInsert(s2, s1);
        } else if(s1.length() - 1 == s2.length()) {
            return oneEditInsert(s1, s2);
        }
        return false;
    }

    private boolean oneEditReplace(String s1, String s2) {
        int diff = 0;
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }
        return diff <= 1;
    }
    
    // Two pointer approach
    private boolean oneEditInsert(String longer, String shorter) {
        int index1 = 0, index2 = 0;
        while (index1 < longer.length() && index2 < shorter.length()) {
            if (longer.charAt(index1) == shorter.charAt(index2)) {
                index2++;
            }
            index1++;
            if (index1 - index2 > 1) {
                return false;
            }
        }
        return true;
    }
}
