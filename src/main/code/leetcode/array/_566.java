package main.code.leetcode.array;

public class _566 {
    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        int[][] mat = {{1,2,3,7,8,9},{4,5,6,7,8,9}};

        matrixReshape(mat, r, c);
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rowLength = mat.length;
        System.out.println(rowLength);
        int cowLength = mat[0].length;
        System.out.println(cowLength);
        if(rowLength * cowLength != r * c) {
            return mat;
        }
        int[][] array = new int[r][c];
        for(int x = 0; x < r * c; x++) {
            array[x / c][x % c] = mat[x / cowLength][x % cowLength];
        }
        return array;

    }
}
