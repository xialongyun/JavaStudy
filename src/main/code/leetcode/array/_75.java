package main.code.leetcode.array;

public class _75 {
    public void sortColors(int[] nums) {
        int l = -1;
        int r = nums.length;
        int m = 1;
        int cur = 0;
        while (cur < r) {
            if (nums[cur] < m) {
                swap(cur++, ++l, nums);
            } else if (nums[cur] > m){
                swap(cur, --r, nums);
            } else {
                cur++;
            }
        }
    }
    public void swap(int l, int r, int[] nums) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
