package main.code.leetcode.array;

public class _209 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,7,8,9,3,4,6,5,2,8,4,3,2,5,7};
        int target = 11;
        int result = minSubArrayLen(target, nums);
        System.out.println(result);
    }
    //滑动窗口
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right;
        int length = Integer.MAX_VALUE;
        int sum = 0;
        for (right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                length = Math.min(length, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
