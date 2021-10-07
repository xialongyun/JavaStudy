package main.code.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};

        System.out.println(threeSum(nums));


    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int l = nums.length;
        if (l < 3) {
            return result;
        }
        Arrays.sort(nums);
        int pre = Integer.MIN_VALUE;
        for (int i = 0; i < l - 2; i++) {
            if (nums[i] > 0) {
                return result;
            }
            if (nums[i] != pre) {
                twoSum(nums, i, 0 - nums[i], result);
                pre = nums[i];
            }
        }
        return result;
    }

    public static void twoSum(int[] nums, int i, int target, List<List<Integer>> result) {
        int pre = Integer.MIN_VALUE;
        for (int m = i + 1; m < nums.length - 1; m++) {
            for (int n = m + 1; n < nums.length; n++) {
                List<Integer> list = new ArrayList<>();
                if (nums[m] != pre && nums[m] + nums[n] == target) {
                    list.add(nums[i]);
                    list.add(nums[m]);
                    list.add(nums[n]);
                    result.add(list);
                    pre = nums[m];
                }
            }
        }
    }
}
