package main.code.leetcode.array;

public class o_ii_069 {
    public int peakIndexInMountainArray(int[] arr) {
        int l = arr.length;
        int left = 1;
        int right = l - 2;
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
