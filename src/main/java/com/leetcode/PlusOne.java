package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        List<Integer> data = new ArrayList<>();
        for(int i=0; i<digits.length; i++){
            data.add(digits[i]);
        }
        Collections.reverse(data);
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< data.size(); i++) {
            int sum = data.get(i) + carry;
            if(sum/10 == 0) {
                result.add(sum);
                carry = 0;
                continue;
            }
            result.add(sum%10);
        }
        if(carry == 1) {
            result.add(1);
        }
        Collections.reverse(result);
        int[] finalResult = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            finalResult[i] = result.get(i);
        }
        return finalResult;
    }
}
