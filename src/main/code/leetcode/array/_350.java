package main.code.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int x : nums1) {
            if(map.containsKey(x)) {
                map.replace(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for(int y : nums2) {
            if(map.containsKey(y)) {
                if(map.get(y) > 0) {
                    array.add(y);
                    map.replace(y, map.get(y) - 1);
                }

            }
        }
        Integer[] arr = new Integer[array.size()];

        return Arrays.stream(array.toArray(arr)).mapToInt(Integer::valueOf).toArray();
        //1234567890
    }
}
