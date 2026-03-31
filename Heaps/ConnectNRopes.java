package Heaps;

import java.util.PriorityQueue;

/**
 * Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost,<br>
 * such that the cost to connect two ropes is equal to the sum of their lengths.<br>
 *  ropes = {4,3,2,6} <br>
 *  ans = 29
 */

public class ConnectNRopes {
    public static void main(String[] args) {
        int[] ropes = {4,3,2,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int rope : ropes) {
            pq.add(rope);
        }

        int cost=0;

        while(pq.size()>1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min+min2;
            pq.add(min+min2);
        }

        System.out.println("cost - "+cost);
    }
}
