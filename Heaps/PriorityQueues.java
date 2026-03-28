package Heaps;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }


    @Override
    public int compareTo(Student o) {
        return this.rank - o.rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}

public class PriorityQueues {

    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(Arrays.asList(2,1,6,3,7,4));
        pq.add(5); // O(logn)

        System.out.println(pq);
        System.out.println("Removed element: "+pq.remove()); // O(logn)
        System.out.println("Top Element (Peek): "+pq.peek()); // O(1)
        System.out.println(pq);

        System.out.println("============PQ for Object============");
        PriorityQueue<Student> stuPQ = new PriorityQueue<>();
        stuPQ.addAll(Arrays.asList(new Student("Aditya", 1), new Student("Mihir", 2), new Student("Ayush", 3)));
        System.out.println(stuPQ);
    }
}
