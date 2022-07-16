package com.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int r){
        if (r == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int c = 0; c < board.length; c++) {
            if (isSafe(board, r, c)){
                board[r][c] = true;
                count += queens(board, r + 1);
                board[r][c] = false;
            }
        }
        return count;
    }

    // fully recursive approach
    static void queens(boolean[][] board, int r, int c, int queens){
        if (queens == 0){
            display(board);
            System.out.println();
            return;
        }

        if (r == board.length)
            return;

        if (c < board.length){
            if (isSafe(board, r, c)) {
                board[r][c] = true;
                queens(board, r + 1, 0, queens - 1);
                board[r][c] = false;
            }
            queens(board, r, c + 1, queens);
        }else {
            queens(board, r + 1, 0, queens);
        }
    }

    static boolean isSafe(boolean[][] board, int r, int c){
        // check vertically.
        for (int i = 0; i < r; i++) {
            if (board[i][c]){
                return false;
            }
        }

        // check diagonally left.
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[r - i][c - i]){
                return false;
            }
        }

        // check diagonally right
        int maxRight = Math.min(r, board.length - c - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[r - i][c + i]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j])
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
