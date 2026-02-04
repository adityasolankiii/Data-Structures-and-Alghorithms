package Backtracking;

public class GridyWaysPermutation {

    // Calculate factorial
    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // Grid ways using permutation formula:
    // Ways = (n+m-2)! / ((n-1)! * (m-1)!)
    static int gridWays(int n, int m) {
        int numerator = factorial(n + m - 2);
        int denominator = factorial(n - 1) * factorial(m - 1);

        return numerator / denominator;
    }

    public static void main(String[] args) {
        System.out.println(gridWays(3, 2)); // Output: 6
    }
}
