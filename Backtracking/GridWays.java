package Backtracking;

public class GridWays {


    public static void main(String[] args) {
        int n=5, m=2;
        System.out.println(findTotalWays(0, 0, n, m));
    }

    private static int findTotalWays(int i, int j, int n, int m) {
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        } else if(i==n || j==m){
            return 0;
        }

        //recursion
        int right = findTotalWays(i+1, j, n, m);
        int left = findTotalWays(i,j+1, n, m);

        return right + left;
    }
}
