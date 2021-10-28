package main.code.leetcode1;

import java.util.*;

public class _47 {
    public static void main(String[] args) {
        int[] nums = {1,1,3};
        System.out.println(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        permute(result, set, nums, 0, nums.length - 1);
        return result;
    }

    //递归
    public static void permute(List<List<Integer>> result, Set<List<Integer>> set, int[] nums, int start, int end) {
        if (end <= 1) {
            if (!set.contains(arrayToList(nums))) {
                result.add(arrayToList(nums));
                set.add(arrayToList(nums));
            }
        }
        if (start == end) {
            if (!set.contains(arrayToList(nums))) {
                result.add(arrayToList(nums));
                set.add(arrayToList(nums));
            }
        } else {
            for (int i = start; i <= end; i++) {
                swap(nums, i, start);
                permute(result, set, nums, start + 1, end);
                swap(nums, i, start);
            }
        }
    }

    //arrayToList
    public static List<Integer> arrayToList(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
        }
        return res;
    }

    //交换
    public static void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}
