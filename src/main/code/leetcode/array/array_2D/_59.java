package main.code.leetcode.array.array_2D;

public class _59 {
    public int[][] generateMatrix(int n) {
        int count = 0;
        int num = 1;
        int[][] matrix = new int[n][n];
        if (n % 2 != 0) {
            matrix[n / 2][n / 2] = n * n;
        }
        for (; n > 1; n = n - 2) {
            num = spiral(n, count, num, matrix);
            count++;
        }

        return matrix;
    }
    public int spiral(int n, int count, int num, int[][] matrix) {
        for (int j = 0; j < n - 1; j++) {
            matrix[0 + count][j + count] = num;
            num++;
        }
        for (int i = 0; i < n - 1; i++) {
            matrix[i + count][n - 1 + count] = num;
            num++;
        }
        for (int j = n - 1; j > 0; j--) {
            matrix[n - 1 + count][j + count] = num;
            num++;
        }
        for (int i = n - 1; i > 0; i--) {
            matrix[i + count][0 + count] = num;
            num++;
        }
        return num;
    }
}
