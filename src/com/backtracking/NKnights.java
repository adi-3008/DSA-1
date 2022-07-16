package com.backtracking;

public class NKnights {
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, 4);
    }

    static void knights(boolean[][] board, int row, int col, int knights){
        if (knights == 0){
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length - 1)
            return;
        if (col == board.length){
            knights(board, row + 1, 0, knights);
            return;
        }
        if (isSafe(board, row ,col)){
            board[row][col] = true;
            knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        knights(board, row, col + 1, knights);
    }

    static boolean isSafe(boolean[][] board, int r, int c){
        if (isValid(board, r - 2, c + 1)){
            if (board[r - 2][c + 1])
                return false;
        }

        if (isValid(board, r - 2, c - 1)){
            if (board[r - 2][c - 1])
                return false;
        }

        if (isValid(board, r - 1, c + 2)){
            if (board[r - 1][c + 2])
                return false;
        }

        if (isValid(board, r - 1, c - 2)){
            if (board[r - 1][c - 2])
                return false;
        }

        return true;

    }

    static boolean isValid(boolean[][] board, int r, int c){
        if (r >= 0 && r < board.length && c >= 0 && c < board.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board){
        for (boolean[] booleans : board) {
            for (boolean aBoolean : booleans) {
                if (aBoolean)
                    System.out.print("K ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
