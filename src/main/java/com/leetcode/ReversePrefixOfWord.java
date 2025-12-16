package com.leetcode;

public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if(found) {
                result.append(word.charAt(i));
            }
            if(word.charAt(i) == ch && !found) {
                found = true;
                for(int j = i; j >= 0; j--) {
                    result.append(word.charAt(j));
                }
            }
        }
        if(!found) {    
            return word;
        }
        return result.toString();
    }
}
