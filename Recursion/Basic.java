public class Basic {
    //Print sum of first n natural number
    public static int calSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calSum(n - 1);
    }
    
    //Print nth Fibonacci number
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(calSum(10));
        System.out.println(fib(5));
    }
}