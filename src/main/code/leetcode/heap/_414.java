package main.code.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _414 {
    public static class MaxNumsComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    }
    public int thirdMax(int[] nums) {
        int result = 0;
        PriorityQueue<Integer> maxProfitQ = new PriorityQueue<Integer>(new MaxNumsComparator());
        for (int num : nums) {
            if (maxProfitQ.isEmpty() || !maxProfitQ.contains(num)) {
                maxProfitQ.add(num);
            }
            if (maxProfitQ.size() > 3) {
                maxProfitQ.poll();
            }
        }
        if (maxProfitQ.size() == 2) {
            maxProfitQ.poll();
            result = maxProfitQ.peek();
        } else {
            result = maxProfitQ.peek();
        }
        return result;
    }
}
