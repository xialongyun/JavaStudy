package main.code.leetcode1.bitOperation;

import java.util.HashSet;
import java.util.Set;

public class _260 {
    /**
     * 异或运算
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * */
    public int[] singleNumber0(int[] nums) {
        int xorsum = 0;
        for (int num : nums) {
            xorsum ^= num;
        }
        // 防止溢出
        int lsb = (xorsum == Integer.MIN_VALUE ? xorsum : xorsum & (-xorsum));
        int type1 = 0, type2 = 0;
        for (int num : nums) {
            if ((num & lsb) == 0) {
                type1 ^= num;
            } else {
                type2 ^= num;
            }
        }
        return new int[] {type1, type2};
    }

    /**
     * hashset
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     * */
    public int[] singleNumber2(int[] nums) {
        if (nums.length == 2) {
            return nums;
        }
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        int j = 0;
        for (int num : set) {
            result[j] = num;
            j++;
        }
        return result;
    }
}
