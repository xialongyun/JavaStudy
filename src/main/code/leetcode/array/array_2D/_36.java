package main.code.leetcode.array.array_2D;

public class _36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][10];
        int[][] cow = new int[10][9];
        int[][] box = new int[9][10];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                if(row[i][board[i][j] - '0'] == 0) {
                    row[i][board[i][j] - '0'] = 1;
                } else {
                    return false;
                }
                if(cow[board[i][j] - '0'][j] == 0) {
                    cow[board[i][j] - '0'][j] = 1;
                } else {
                    return false;
                }
                if(box[(i / 3) * 3 + j / 3][board[i][j] - '0'] == 0) {
                    box[(i / 3) * 3 + j / 3][board[i][j] - '0'] = 1;
                } else {
                    return false;
                }
            }
        }

        return true;

    }
}
