package CollectionFrameworks.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class InterleaveTwoHalves {

    private static void interleave(Queue<Integer> q1) {
        Queue<Integer> q2 = new ArrayDeque<>();
        int size = q1.size()/2;

        while(q2.size() < size) {
            q2.add(q1.remove());
        }

        while(!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
        interleave(q);
        for (int i: q) {
            System.out.print(i + " ");
        }
    }
}
