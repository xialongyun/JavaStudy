package main.code.leetcode.array;

public class _4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = 0;
        double result = 0.0;
        if ((m + n) % 2 == 0) {
            while ((left + right) * 2 < (m + n)) {
                if (nums1[left] < nums2[right]) {
                    left++;
                } else {
                    right++;
                }
            }
            result = (nums1[left] + nums2[right]) / 2;

        } else {
            while ((left + right) * 2 < (m + n - 1)) {
                if (nums1[left] < nums2[right]) {
                    left++;
                } else {
                    right++;
                }
            }
            if (nums1[left] < nums2[right]) {
                result = nums1[left];
            } else {
                result = nums2[right];
            }
        }
        return result;
    }
}
