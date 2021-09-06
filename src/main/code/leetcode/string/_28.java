package main.code.leetcode.string;

public class _28 {
    public int strStr1(String haystack, String needle) {
        int H = haystack.length();
        int N = needle.length();

        for (int start = 0; start < H - N + 1; start++) {
            if (haystack.substring(start, start + N).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
    /**
     *  暴力搜索
     * */
    public int strStr2(String haystack, String needle) {
        int H = haystack.length();
        int N = needle.length();
        for(int i = 0; i + N <= H; i++) {
            boolean flag = true;
            for(int j = 0; j < N; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                return i;
            }
        }
        return -1;
    }
    /**
     *  KMP算法
     * */
    public int strStr3(String haystack, String needle) {
        int H = haystack.length();
        int N = needle.length();

        for (int start = 0; start < H - N + 1; start++) {
            if (haystack.substring(start, start + N).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}
