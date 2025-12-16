package com.leetcode;

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int nameIndex = 0;
        int typedIndex = 0;
        if(typed.length() < name.length()) {
            return false;
        }
        while (typedIndex < typed.length()) {
            int currentNameIndex = nameIndex < name.length() ? nameIndex : name.length() - 1;
            if (name.charAt(currentNameIndex) == typed.charAt(typedIndex)) {
                nameIndex = nameIndex < name.length() ? nameIndex + 1 : nameIndex;
                typedIndex++;
            }
            else if (typedIndex > 0 && typed.charAt(typedIndex) == typed.charAt(typedIndex - 1)) {
                typedIndex++;
            }
            else {
                return false;
            }
        }
        return nameIndex == name.length();
    }
}
