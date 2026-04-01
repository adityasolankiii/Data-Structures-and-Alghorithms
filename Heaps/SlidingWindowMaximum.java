package Heaps;

import java.util.PriorityQueue;

/***
 * Maximum of all Subarrays of Size K
 */
public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int number;
        int idx;

        public Pair(int numbers, int idx) {
            this.number = numbers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair that) {
            if (this.number == that.number) {
                return that.idx - this.idx; // newer index first
            }
            return that.number - this.number; // max heap
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "number=" + number +
                    ", idx=" + idx +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = new int[arr.length-k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //1st window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        if (!pq.isEmpty()) res[0] = pq.peek().number;

        for (int i = k; i < arr.length; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= (i-k) ) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            if (!pq.isEmpty()) res[i-k+1] = pq.peek().number;
        }

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
