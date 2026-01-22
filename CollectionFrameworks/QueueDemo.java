package CollectionFrameworks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        //PriorityQueue
        /*Queue<String> pq = new PriorityQueue<>();
        pq.offer("ABC");
        pq.offer("PQR");
        pq.offer("XYZ");*/

        //System.out.println(pq);
        //System.out.println(pq.element()); //return first but not remove - gives exception if queue is null
        //System.out.println(pq.peek()); //return first but not remove - not gives exception if queue is null

        /*Iterator<String> it = pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        /*PriorityQueue<Integer> pqi = new PriorityQueue<>();
        pqi.offer(80);
        pqi.offer(10);
        pqi.offer(20);

        System.out.println(pqi);
        System.out.println(pqi.poll());
        System.out.println(pqi);*/


        PriorityQueue<Integer> pqi = new PriorityQueue<>((a,b) -> b-a);
        pqi.offer(80);
        pqi.offer(10);
        pqi.offer(20);

        System.out.println(pqi);
        System.out.println(pqi.poll());
        System.out.println(pqi);

        //Queue with LinkedList
        /*Queue<Integer> qi = new LinkedList<>();
        qi.offer(10);
        qi.offer(20);
        qi.offer(30);
        qi.offer(40);*/

        /*System.out.println(qi);
        System.out.println(qi.poll());
        System.out.println(qi);
        System.out.println(qi.peek());
        System.out.println(qi);*/

        //Deque
        //ArrayDeque
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);
        dq.pollLast();

        System.out.println(dq);
    }
}