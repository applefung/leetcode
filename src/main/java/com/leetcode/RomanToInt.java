package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> config = new HashMap<>();
        config.put("I", 1);
        config.put("V", 5);
        config.put("X", 10);
        config.put("L", 50);
        config.put("C", 100);
        config.put("D", 500);
        config.put("M", 1000);
        int result = 0;
        for(int i=0; i<s.length();i++) {
            if(i+1<s.length()) {
                int next = config.get(String.valueOf(s.charAt(i+1)));
                if(s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                    result = result - config.get("C") + next;
                    i++;
                    continue;
                }
                if(s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                    result = result - config.get("X") + next;
                    i++;
                    continue;
                }
                if(s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                    result = result - config.get("I") + next;
                    i++;
                    continue;
                }
            }
            result+=config.get(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
