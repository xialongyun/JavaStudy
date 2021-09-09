package main.code.leetcode.array;

public class _283 {
    public void moveZeroes(int[] nums) {
        int lengthOfNums = nums.length;
        int left = 0;
        int right = lengthOfNums - 1;
        while(left < right) {
            if(nums[left] == 0) {
                swap(nums, left, right);
                right --;
            } else {
                left++;
            }
        }
    }

    public void swap(int[] nums, int left, int right){
        for(int i = left; i < right; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
    }
}
