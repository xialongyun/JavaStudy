package main.code.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

public class _o_40 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return Arrays.stream(Arrays.copyOfRange(integers, 0, k)).mapToInt(Integer::valueOf).toArray();
    }
}
