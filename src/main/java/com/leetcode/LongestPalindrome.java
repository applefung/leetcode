package com.leetcode;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String oddResult = "";
        String evenResult = "";
        for(int i=0; i<s.length(); i++) {
            if(i==0) {
                String first = String.valueOf(s.charAt(0));
                if(s.length()==1) {
                    return first;
                }
                if(s.charAt(0)==s.charAt(1)) {
                    oddResult = s.substring(0, 2);
                    continue;
                }
                oddResult = first;
                continue;
            }

            int evenIndex = 1;
            int evenLeft  = i;
            int evenRight = i+1;

            // even
            while(evenLeft>=0 && evenRight<s.length() && evenLeft<=i && s.charAt(evenLeft) == s.charAt(evenRight)) {
                String tempEvenResult = s.substring(evenLeft, evenRight+1);
                evenResult = evenResult.length() > tempEvenResult.length() ? evenResult : tempEvenResult;
                evenIndex++;
                evenRight = i+evenIndex;
                evenLeft = i-evenIndex+1;
            }

            // odd
            int oddIndex = 1;
            int oddLeft = i - 1;
            int oddRight = i + 1;

            while(oddLeft>=0 && oddRight<s.length() && oddIndex<=i && s.charAt(oddLeft) == s.charAt(oddRight)) {
                String tempOddResult = s.substring(oddLeft, oddRight+1);
                oddResult = oddResult.length() > tempOddResult.length() ? oddResult : tempOddResult;
                oddIndex++;
                oddLeft = i - oddIndex;
                oddRight = i + oddIndex;
            }
        }
        return oddResult.length()>evenResult.length()?oddResult:evenResult;
    }
}
