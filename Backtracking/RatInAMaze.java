package Backtracking;

public class RatInAMaze {
    private static void printSol(int[][] sol) {
        for (int[] ints : sol) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] maze, int i, int j){
        return (i>=0 && i<maze.length && j>=0 && j<maze[0].length && maze[i][j]==1);
    }

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] sol){
        //base case
        if(i == maze.length-1 && j == maze[0].length-1 && maze[i][j] == 1){
            sol[i][j] = 1;
            return true;
        }

        //recursion
        if(isSafe(maze, i, j)){
            if(sol[i][j] == 1)
                return false;

            sol[i][j] = 1;

            if(solveMaze(maze, i+1, j, sol))
                return true;
            if(solveMaze(maze, i, j+1, sol))
                return true;

            sol[i][j] = 0;

            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 1, 1, 0 },
                { 1, 0, 1, 1 },
                { 1, 1, 1, 0 },
                { 1, 1, 1, 1 }
        };
        int[][] sol = new int[maze.length][maze[0].length];

        if(solveMaze(maze,0,0, sol)){
            printSol(sol);
        } else {
            System.out.println("Solution doesn't exists!!!");
        }
    }
}
