package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            String curr = strs[i];
            char[] arr = curr.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(curr);
        }
        for(List<String> list: map.values()) {
            result.add(list);
        }
        return result;
    }
}
