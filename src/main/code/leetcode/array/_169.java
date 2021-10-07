package main.code.leetcode.array;

public class _169 {
    public int majorityElement(int[] nums) {
        int v = nums[0];
        int l = nums.length;
        if (l == 1) {
            return v;
        }
        int count = 1;
        for (int i = 1; i < l; i++) {
            if (nums[i] != v) {
                count--;
            } else {
                count++;
            }
            if (count == 0) {
                v = nums[i];
                count++;
            }
        }
        return v;
    }
}
