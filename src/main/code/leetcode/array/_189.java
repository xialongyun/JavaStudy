package main.code.leetcode.array;

public class _189 {

    public void rotate(int[] nums, int k) {
        int n = k % nums.length ;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, n - 1);
        reverse(nums, n, nums.length - 1);
    }

    public void reverse(int[] nums, int left, int right) {
        while(left < right ) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate1(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);//数组copy
    }
}
