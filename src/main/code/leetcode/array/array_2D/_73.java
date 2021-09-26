package main.code.leetcode.array.array_2D;

import java.util.HashSet;
import java.util.Set;

public class _73 {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int cowLength = matrix[0].length;
        Set<Integer> rowSet = new HashSet<Integer>();
        Set<Integer> cowSet = new HashSet<Integer>();
        for(int i = 0; i < rowLength; i++) {
            for(int j = 0; j < cowLength; j++) {
                if(matrix[i][j] == 0) {
                    rowSet.add(i);
                    cowSet.add(j);
                }
            }
        }
        for(int i = 0; i < rowLength; i++) {
            for(int j = 0; j < cowLength; j++) {
                if(rowSet.contains(i) || cowSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }


    }
}
