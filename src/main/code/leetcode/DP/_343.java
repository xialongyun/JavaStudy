package main.code.leetcode.DP;

public class _343 {
    public int integerBreak(int n) {
        if(n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[2] = 1;
        dp[3] = 2;
        for(int i = 3; i <= n; i++ ) {
            for(int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i -j] * j, j*(i - j)));
            }
        }
        return dp[n];
    }
}
