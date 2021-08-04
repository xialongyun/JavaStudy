package leetcode.array;

public class _704 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 2;
        int result = simpleSearch(nums, target);
        System.out.println(result);
    }
    //暴力搜索
    public static int simpleSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    //二分法
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }else if (nums[middle] < target) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
