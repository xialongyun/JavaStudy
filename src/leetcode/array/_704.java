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
}
