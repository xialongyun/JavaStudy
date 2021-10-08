package main.code.leetcode.array.array_2D;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; ++i) {
            if (result.size() == 0 || result.get(result.size() - 1)[1] < intervals[i][0]) {
                result.add(new int[] {intervals[i][0], intervals[i][1]});
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], intervals[i][1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
