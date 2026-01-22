package MultiThreading.task;

import java.util.Arrays;

public class Task_4_MaxValue {
    public static void main(String[] args) {
        int[] arr = {101, 20, 50, 4, 60, 89, 46, 69, 21, 99};
        int mid = arr.length / 2;

        // separating left half of an array
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        // separating right half of an array
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);


        FindMaxValue leftThread = new FindMaxValue(leftArr);
        FindMaxValue rightThread = new FindMaxValue(rightArr);

        leftThread.start();
        rightThread.start();

        try {
            leftThread.join();
            rightThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Max Element from left partition is: " + leftThread.getMax());

        System.out.println("Max Element from right partition is: " + rightThread.getMax());

        System.out.println("Overall max element is:" + Math.max(leftThread.getMax(), rightThread.getMax()));

    }
}

class FindMaxValue extends Thread {
    private final int[] arr;
    private int max;

    public FindMaxValue(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        synchronized (this) {
            max = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
        }
    }

    // method which return the max value
    public int getMax() {
        return max;
    }
}
