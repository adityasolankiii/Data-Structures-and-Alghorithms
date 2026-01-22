package MultiThreading.task;

import java.util.Arrays;

public class Task_3_MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 4, 3, 2, 9, 8, 7};

        Thread t1 = new Thread(new MergeSort(arr));
        t1.start();

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}

/**
 * MergeSort Class
 */
class MergeSort implements Runnable {
    private final int[] arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        Thread left_thread = new Thread(new MergeSort(left));
        Thread right_thread = new Thread(new MergeSort(right));

        left_thread.start();
        right_thread.start();

        try {
            left_thread.join();
            right_thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        merge(arr, left, right);
    }

    /**
     * method for merge an array
     * @param arr -
     * @param left -
     * @param right -
     */
    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}