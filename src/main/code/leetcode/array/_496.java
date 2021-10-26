package main.code.leetcode.array;

import java.util.HashMap;
import java.util.Stack;

public class _496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int x = 0;
            result[i] = -1;
            while (x < nums2.length && nums2[x] != nums1[i]) {
                x++;
            }
            for (int j = x + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;
    }
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(nums2[i]);
                map.put(nums2[i], -1);
            } else if (nums2[i] < stack.peek()) {
                map.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]).intValue();
        }
        return result;
    }
}
