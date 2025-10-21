package com.leetcode;

import java.util.HashMap;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c: s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c: t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) - 1);
        }
        return count.values().stream().allMatch(v -> v == 0);
    }

}
