package leetcode.array;
/**
 * 977. 有序数组的平方
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * 示例：
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
* */
public class _977 {
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1};
        printNums(sortedSquares(nums));
    }
    /**
     * 前后双指针
     */
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length - 1;
        int left = 0;
        int right = n;
        int[] result = new int[n + 1];
        for (int i = n; i >= 0; i--) {
            int l = nums[left]*nums[left];
            int r = nums[right]*nums[right];
            if (l > r) {
                result[i] = l;
                left++;
            } else {
                result[i] = r;
                right--;
            }
        }
        return result;
    }
    public static void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++ ) {
            System.out.println(nums[i]);
        }
    }
}
