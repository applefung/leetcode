package com.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        List<Integer> data = new ArrayList<>();
        int num = x;
        while(num>0) {
            int remainder = num%10;
            num = num/10;
            data.add(remainder);
        }
        Collections.reverse(data);
        boolean isEven = data.size()%2 == 0;
        int half = data.size()/2;
        if(isEven) {
            int right = half;
            int left = half - 1;
            for(int i=0; i<data.size()/2; i++) {
                if(data.get(left) != data.get(right)) {
                    return false;
                }
                right++;
                left--;
            }
            return true;
        }

        int right = half + 1;
        int left = half - 1;
        for(int i=0; i<data.size()/2; i++) {
            if(data.get(left) != data.get(right)) {
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}
