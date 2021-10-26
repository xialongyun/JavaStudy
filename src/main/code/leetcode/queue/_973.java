package main.code.leetcode.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class _973 {
    public static int[][] kClosest0(int[][] points, int k) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return ((o1[0]*o1[0] + o1[1]*o1[1]) - (o2[0]*o2[0] + o2[1]*o2[1]));
            }
        });
        return Arrays.copyOfRange(points, 0, k);
    }

    public static int[][] kClosest1(int[][] points, int k) {
        Arrays.sort(points, new minComparator());
        return Arrays.copyOfRange(points, 0, k);
    }

    public static class minComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            return ((o1[0]*o1[0] + o1[1]*o1[1]) - (o2[0]*o2[0] + o2[1]*o2[1]));
        }
    }
}
