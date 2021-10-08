package main.code.leetcode.graph;

public class _997 {
    public static void main(String[] args) {
        int[][] arr = {{1,2}};
        System.out.println(findJudge(2, arr));
    }
    public static int findJudge(int n, int[][] trust) {
        int[] in = new int[n + 1];
        int[] out = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            out[trust[i][0]]++;
            in[trust[i][1]]++;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(in[i]);
            System.out.println(out[i]);
            if (in[i] == n - 1 && out[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
