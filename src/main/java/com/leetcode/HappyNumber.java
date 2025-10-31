package com.leetcode;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumSquares(slow);
            fast = sumSquares(sumSquares(fast));
        } while(fast != 1 && slow != fast);
        return fast == 1;
    }

    private int sumSquares(int n) {
        char[] numbers = String.valueOf(n).toCharArray();
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum+=Character.getNumericValue(numbers[i])*Character.getNumericValue(numbers[i]);
        }
        return sum;
    }
}
