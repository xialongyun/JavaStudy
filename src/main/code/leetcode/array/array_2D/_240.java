package main.code.leetcode.array.array_2D;

public class _240 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix0(matrix,5));
    }
    /**
     * 左下角遍历
     * */
    public static boolean searchMatrix0(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (j < matrix[0].length && i >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            }
        }
        return false;
    }
    /**
     * 蛇形搜索
     * */
    public static boolean searchMatrix1(int[][] matrix, int target) {
        return rightSearch(matrix, target, 0, 0);
    }
    public static boolean rightSearch(int[][] matrix, int target, int i ,int j) {
        if (j == matrix[0].length ||matrix[i][j] > target) {
            return downSearch(matrix, target, ++i, --j);
        } else if (matrix[i][j] < target) {
            return rightSearch(matrix, target, i, ++j);
        } else if (matrix[i][j] == target) {
            return true;
        }
        return false;
    }
    public static boolean downSearch(int[][] matrix, int target, int i ,int j) {
        if (j == -1 ||i == matrix.length) {
            return false;
        }
        if (matrix[i][j] > target) {
            return leftSearch(matrix, target, i, --j);
        } else if (matrix[i][j] < target) {
            return downSearch(matrix, target, ++i, j);
        } else if (matrix[i][j] == target) {
            return true;
        }
        return false;
    }
    public static boolean leftSearch(int[][] matrix, int target, int i ,int j) {
        if (j == -1) {
            return false;
        }
        if (matrix[i][j] > target) {
            return leftSearch(matrix, target, i, --j);
        } else if (matrix[i][j] < target) {
            return downSearch(matrix, target, ++i, j);
        } else if (matrix[i][j] == target) {
            return true;
        }
        return false;
    }
}
