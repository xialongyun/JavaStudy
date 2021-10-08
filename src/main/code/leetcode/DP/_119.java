package main.code.leetcode.DP;

import java.util.ArrayList;
import java.util.List;

public class _119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if (rowIndex == 0) {
            res.add(1);
            return res;
        }
        int[] result = new int[rowIndex + 2];
        result[0] = 0;
        result[1] = 1;
        int count = 2;
        for (int i = 0; i < rowIndex; i++) {
            for (int j = count; j >= 1; j--) {
                result[j] = result[j] + result[j - 1];
            }
            count++;
        }
        for (int i = 1; i < rowIndex + 2; i++) {
            res.add(result[i]);
        }
        return res;
    }
}
