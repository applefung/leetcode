package com.leetcode;

public class ReverseString2 {
    // 2 pointer
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int factor = 2*k;
        int size = s.length()/factor;
        int finalSize = s.length() % factor == 0 ? size : size+1;
        for(int i=0; i<finalSize; i++){
            int start = i*factor;
            int end = Math.min(start+k-1, s.length()-1);
            System.out.println("start: "+start);
            System.out.println("end: "+end);
            while(start<end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }
}
