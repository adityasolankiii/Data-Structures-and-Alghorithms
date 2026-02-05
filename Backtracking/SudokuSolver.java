package Backtracking;

public class SudokuSolver {

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit){
        //for col
        for (int i = 0; i < 9; i++) {
            if(sudoku[i][col] == digit) return false;
        }

        //for row
        for (int j = 0; j < 9; j++) {
            if(sudoku[row][j] == digit) return false;
        }

        //for grid
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;

        for (int i = sRow; i <=  sRow+2; i++) {
            for (int j = sCol; j <= sCol+2; j++) {
                if(sudoku[i][j] == digit) return false;
            }
        }

        return true;
    }

    public static boolean solve(int[][] sudoku, int row, int col){
       //base case
        if(row == 8 && col == 8){
            return true;
        }

       //recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(sudoku[row][col] != 0){
            return solve(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(solve(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
    
        return false;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(solve(sudoku,0,0)) printSolution(sudoku);
        else System.out.println("Solution Doesn't Exists!!!");

    }

    private static void printSolution(int[][] sudoku) {
        for (int[] ints : sudoku) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(ints[j]+" ");
            }
            System.out.println();
        }
    }
}
