package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddBinary {
    public String addBinary(String a, String b) {
        int length = a.length() > b.length() ? a.length() : b.length();
        List<Integer> result = new ArrayList<>();
        int index = 1;
        int aLength = a.length();
        int bLength = b.length();
        int carry = 0;
        while (index<=aLength&&index<=bLength) {
            int sum = Integer.parseInt(String.valueOf(a.charAt(aLength - index))) + Integer.parseInt(String.valueOf(b.charAt(bLength - index))) + carry;
            carry = sum/2;
            result.add(sum%2);
            index++;
        }
        index--;
        for(int i = index; i<length; i++) {
            if(aLength > index) {
                int sum = Integer.parseInt(String.valueOf(a.charAt(length-i-1)))+carry;
                carry=sum/2;
                result.add(sum%2);
                continue;
            }
            if(bLength > index) {
                int sum = Integer.parseInt(String.valueOf(b.charAt(length-i-1)))+carry;
                carry=sum/2;
                result.add(sum%2);
            }
        }
        if(carry>0) {
            result.add(1);
        }
        Collections.reverse(result);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<result.size(); i++) {
            sb.append(result.get(i));
        }
        return sb.toString();
    }
}
