package MultiThreading.task;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task_1_PrintOddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        Thread even = new Thread(new OddEvenNumbers(start, end, true), "Even");
        Thread odd = new Thread(new OddEvenNumbers(start, end, false), "Odd");
        even.start();
        odd.start();
    }
}

class OddEvenNumbers implements Runnable {
    private static int start;
    private final int end;
    private final boolean isEven;
    public final Lock lock = new ReentrantLock();

    /**
     * Constructor
     * @param start Int
     * @param end Int
     * @param isEven Boolean
     */
    public OddEvenNumbers(int start, int end, boolean isEven) {
        OddEvenNumbers.start = start;
        this.end = end;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        while (start < end) {
            //            lock.lock();
            if (lock.tryLock()) {
                try {
                    if (isEven && start % 2 == 0 || !isEven && start % 2 != 0) {
                        if (start == 0) {
                            System.out.println(start);
                        } else {
                            System.out.println(Thread.currentThread().getName() + " : " + start);
                        }
                        start++;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {
                    lock.unlock();
                }

            } else {
                System.out.println(Thread.currentThread().getName() + " Lock not acquire!");
            }

        }
    }
}