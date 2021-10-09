package main.code.leetcode.bitOperation;

public class _7 {
    public int reverse(int x) {
        if (x > -10 && x < 10) {
            return x;
        }
        int result = 0;     //初始化结果
        while (x != 0) {
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }
}
