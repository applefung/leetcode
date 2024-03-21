package com.leetcode;

import java.util.*;

public class ValidParentheses {
    public boolean validParentheses(String s) {
        Map<String, String> config = new HashMap<>();
        config.put("(", ")");
        config.put("[", "]");
        config.put("{", "}");

        Stack<String> openStack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            String curr = String.valueOf(s.charAt(i));
            String pair = config.get(curr);
            if(pair != null) {
                openStack.push(curr);
                continue;
            }
            if(openStack.isEmpty()) {
                return false;
            }
            String openPeek = openStack.peek();
            String openPopPair  = config.get(openPeek);
            if(curr.equals(openPopPair)) {
                openStack.pop();
            }
            else {
                return false;
            }
        }
        return openStack.empty();
    }
}
