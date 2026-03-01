package CollectionFrameworks.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {

    private static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    private static void reverseQueueRecursive(Queue<Integer> q) {
        //base case
        if(q.isEmpty()) {
            return;
        }

        //recursion
        int el = q.remove();
        reverseQueueRecursive(q);
        q.add(el);
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Queue<Integer> queue2 = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println("Recursive");
        reverseQueueRecursive(queue1);
        for(int el : queue1) {
            System.out.print(el+" ");
        }
        System.out.println("\nUsing Stack");
        reverseQueue(queue2);
        for(int el : queue2) {
            System.out.print(el+" ");
        }
    }
}
