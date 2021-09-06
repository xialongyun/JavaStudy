package main.code.leetcode.array;

public class _35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while(left <= right) {
            middle = left + (right - left) / 2;
            if(nums[middle] == target) {
                return middle;
            } else if(nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if(nums[middle] < target) {
            return middle + 1;
        } else {
            return middle;
        }
    }
}
