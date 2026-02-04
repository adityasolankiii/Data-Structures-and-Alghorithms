package Backtracking;

import java.util.Scanner;

class NQueens {
    static int count = 0;

    private static void nQueens(char[][] board, int row) {
        //base case
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }

        //recursion
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                nQueens(board,row+1);
                board[row][col] = 'x';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {

        //Vertical up
        for (int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //Left up Diagonal
        for (int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //Right up Diagonal
        for (int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("----- Chess Board -----");
        for(char[] rows: board){
            for(char col: rows){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
        System.out.println("Total ways : "+count);
    }
}
