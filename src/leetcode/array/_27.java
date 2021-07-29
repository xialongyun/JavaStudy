package leetcode.array;

public class _27 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,1,3,5,7,3,2};
        int val = 2;
        //int result = removeElement0(nums,val);
        int result = removeElement1(nums,val);
        System.out.println(result);
        printNums(nums, result);

    }

    //双指针
    public static int removeElement0(int[] nums, int val) {
        int slowIndex = 0;
        int fastIndex;
        int n = nums.length;
        for (fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    //优化双指针
    public static int removeElement1(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
    //
    public static void printNums(int[] nums, int length) {
        for (int i = 0; i < length; i++ ) {
            System.out.println(nums[i]);
        }
    }
}
