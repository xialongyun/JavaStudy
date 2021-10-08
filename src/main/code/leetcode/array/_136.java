package main.code.leetcode.array;

public class _136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int x : nums) {
            result ^= x;
        }
        return result;
    }
}
