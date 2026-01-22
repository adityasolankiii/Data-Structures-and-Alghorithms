package MultiThreading.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task_5_MatrixMultiplication {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int[][] B = {
                {9, 8, 7},
                {6, 5, 4},
        };

        int[][] result = new int[A.length][B[0].length];

        ExecutorService es = Executors.newFixedThreadPool(A.length);
        try {
            for (int currRow = 0; currRow < A.length; currRow++) {
                es.submit(new MatrixMultiply(A, B, result, currRow));
            }

            es.shutdown();

            if (!es.awaitTermination(1, TimeUnit.SECONDS)) {
                es.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.out.println("awaitTermination - InterruptedException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("newFixedThreadPool - IllegalArgumentException : " + e.getMessage());
        }

        for (int[] row : result) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

class MatrixMultiply implements Runnable {
    private final int[][] A;
    private final int[][] B;
    private final int[][] result;
    private final int currRow;

    /**
     * Constructor
     *
     * @param A       Matrix A
     * @param B       Matrix B
     * @param result  Result Matrix
     * @param currRow current row
     */
    public MatrixMultiply(int[][] A, int[][] B, int[][] result, int currRow) {
        this.A = A;
        this.B = B;
        this.result = result;
        this.currRow = currRow;
    }

    @Override
    public void run() {
        //Row'
        for (int i = 0; i < B[0].length; i++) {
            //Column
            for (int j = 0; j < A[0].length; j++) {
                result[currRow][i] += A[currRow][j] * B[j][i];
//                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}