package main.code.leetcode.string;

public class _541 {
    public static void main(String[] args) {
        System.out.println(reverseStr("qwertyuiop", 3));
    }
    public static String reverseStr(String s, int k) {
        int length = s.length();
        char[] arr = s.toCharArray();
        for(int i = 0; i < length; i = i + 2 * k) {
            reverseString(arr, i, Math.min(i + k, length) - 1);
        }
        return new String(arr);
    }

    public static void reverseString(char[] arr, int left, int right) {
        for(; left < right; left++, right--) {
            char flag = arr[left];
            arr[left] = arr[right];
            arr[right] = flag;
        }
    }
}
