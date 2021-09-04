package main.code.leetcode.string;

public class _344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(s));
    }
    public static char[] reverseString(char[] s) {
        int length = s.length;
        for(int left = 0, right = length - 1; left < right; left++, right--) {
            char flag = s[left];
            s[left] = s[right];
            s[right] = flag;
        }
        return s;
    }
}
