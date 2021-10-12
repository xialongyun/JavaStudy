package main.code.leetcode.string;

public class _409 {
    public int longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        boolean[] a = new boolean[26];
        boolean[] A = new boolean[26];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] - 'Z' > 0) {
                if (a[ch[i] - 'a']) {
                    a[ch[i] - 'a'] = false;
                    count = count + 2;
                } else {
                    a[ch[i] - 'a'] = true;
                }
            } else {
                if (A[ch[i] - 'A']) {
                    A[ch[i] - 'A'] = false;
                    count = count + 2;
                } else {
                    A[ch[i] - 'A'] = true;
                }
            }
        }
        return count < ch.length ? count + 1 : count;
    }
}
