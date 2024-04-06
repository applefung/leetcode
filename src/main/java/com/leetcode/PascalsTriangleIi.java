package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIi {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int k=0; k<i+1; k++) {
                if(i==0) {
                    row.add(1);
                    continue;
                }
                if(k==0 || k==i) {
                    row.add(1);
                    continue;
                }
                List<Integer> prevRow = result.get(i-1);
                row.add(prevRow.get(k-1) + prevRow.get(k));
            }
            result.add(row);
        }
        return result;
    }

    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex+1).get(rowIndex);
    }
}
