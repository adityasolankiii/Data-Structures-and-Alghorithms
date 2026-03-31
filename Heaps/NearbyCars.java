package Heaps;

import java.util.PriorityQueue;

/***
 * we are given N points in a 2D plane which are locations of N cars.
 *<br>
 * If we are at the origin, print the nearest K cars.
 * <hr>
 * C0 (3,3)<br>
 * C1 (5,-1)<br>
 * C2 (-2,4)<br>
 * k=2<br>
 * ans = C0 & C2
 *<hr>
 */
public class NearbyCars {
    static class Points implements Comparable<Points> {
        int x;
        int y;
        int distSq;

        public Points(int x, int y, int distSq) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(Points that) {
            return this.distSq - that.distSq;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }
    public static void main(String[] args) {
        int[][] pts = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<Points> pq = new PriorityQueue<>();

        for (int[] pt : pts) {
            int distSq = pt[0] * pt[0] + pt[1] * pt[1];
            pq.add(new Points(pt[0], pt[1], distSq));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C"+pq.remove());
        }
    }
}
