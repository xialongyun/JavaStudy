package leetcode.array;
/**
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
* */
public class _59 {
    public static int[][] generateMatrix(int n) {
        int[][] nums= new int[n][n];
        int N = 1;
        int loop = n/2;
        int startI = 0;
        int startJ = 0;

        while (loop > 0) {
            for (; startJ < n - startI - startJ - 1; startJ++) {
                nums[startI][startJ] = N;
                N++;
            }
            for (; startI > n - startI - startJ - 1; startI++) {
                nums[startI][startJ] = N;
                N++;
            }
            for (; startJ > 0; startJ--) {
                nums[startI][startJ] = N;
                N++;
            }
            for (; startI > 0; startI--) {
                nums[startI][startJ] = N;
                N++;
            }
            startI++;
            startJ++;
            loop--;
        }



        return nums;
    }
}
