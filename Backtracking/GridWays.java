package Backtracking;

public class GridWays {

    /***
     * This method will returns number of ways to reach destination
     * @param i starting row
     * @param j starting column
     * @param n rows
     * @param m columns
     * @return int number of ways to reach destination
     */
    public static int findTotalWays(int i, int j, int n, int m) {
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        } else if(i==n || j==m){
            return 0;
        }

        //recursion
        int down = findTotalWays(i+1, j, n, m);
        int right = findTotalWays(i,j+1, n, m);

        return right + down;
    }

    public static void main(String[] args) {
        int n=5, m=5;
        System.out.println(findTotalWays(0, 0, n, m));
    }
}