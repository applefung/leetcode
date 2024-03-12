package com.leetcode;

import java.util.*;
// Leetcode 316
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        String[] stringArray = s.split("");
        List<String> list = new ArrayList<>();
        // store the occurrence of the characters, remark: ascii map
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            // remark: char == int
            count[s.charAt(i)]++;
        }
        for(int i=0; i<stringArray.length; i++) {
            String curr = stringArray[i];
            // initialise the list, and deduct 1 from the count
            if(i==0) {
                list.add(curr);
                count[curr.charAt(0)]--;
                continue;
            }
            if(list.contains(curr)) {
                // if its duplicated, then continue and deduct 1 from the count
                count[curr.charAt(0)]--;
                continue;
            }
            // if its duplicated, then continue and deduct 1 from the count
            // reason for checking non-zero list: bcabc
            while (list.size() != 0 && list.get(list.size()-1).compareTo(curr) >= 0) {
                String lastListItem = list.get(list.size()-1);
                // this lastListItem is the last item, then break the loop
                if(count[lastListItem.charAt(0)]==0) {
                    break;
                }
                // remove the item if the previous value is bigger than the current one
                list.remove(lastListItem);
            }
            // add the current value
            list.add(curr);
            // deduct the 1 from the count
            count[curr.charAt(0)]--;
        }
        StringBuilder sb = new StringBuilder();
        for (String item : list) {
            sb.append(item);
        }
        return sb.toString();
    }
}
