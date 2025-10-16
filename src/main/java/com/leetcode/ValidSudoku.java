package com.leetcode;

import java.util.HashMap;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        StringBuilder rowSb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                rowSb.append(board[i][j]);
            }
        }
        String boardRowString = rowSb.toString();
        // Check row
        if(!checkCharExist(boardRowString)) {
            return false;
        }


        // Check column
        StringBuilder columnSb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                columnSb.append(board[j][i]);
            }
        }
        String boardColumnString = columnSb.toString();
        if(!checkCharExist(boardColumnString)) {
            return false;
        }

        // Check 3x3 sub-box
        HashMap<Integer, String> subBoxMap = new HashMap<>();
        StringBuilder subBoxSb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if(i % 3 == 0 && i != 0) {
                for(int j = 0; j < 3; j++) {
                    subBoxSb.append(subBoxMap.get(j));
                }
                subBoxMap.clear();
            }
            int count = 0;
            for (int j = 0; j < 9; j=j+3) {
                String subBox = boardRowString.substring(i*9+j, i*9+j+3);
                StringBuilder subSb = new StringBuilder(subBoxMap.getOrDefault(count, ""));
                subSb.append(subBox);
                subBoxMap.put(count, subSb.toString());
                count++;
            }
            count=0;
        }
        for(int j = 0; j < 3; j++) {
            subBoxSb.append(subBoxMap.get(j));
        }

        String subBoxString = subBoxSb.toString();
        if(!checkCharExist(subBoxString)) {
            return false;
        }

        return true;
    }

    private static boolean checkCharExist(String str) {
        for (int i = 0; i < str.length(); i=i+9) {
            String subStr = str.substring(i, i+9);
            HashMap<Character, Integer> subStrMap = new HashMap<>();
            for(int j = 0; j < subStr.length(); j++) {
                char c = subStr.charAt(j);
                if(c == '.') {
                    continue;
                }
                if(subStrMap.containsKey(c)) {
                    return false;
                }
                subStrMap.put(c, 1);
            }
        }
        return true;
    }
}