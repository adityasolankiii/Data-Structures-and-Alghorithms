package Hashing;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetClass {
    public static void main(String[] args) {

        // 1. Create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // 2. add()
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println("Sorted Set: " + set);

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. contains()
        System.out.println("Contains 20? " + set.contains(20));

        // 5. remove()
        set.remove(40);
        System.out.println("After remove(): " + set);

        // 6. iterator()
        System.out.println("Using Iterator:");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 7. first() & last()
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        // 8. higher(), lower()
        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 20: " + set.lower(20));

        // 9. ceiling(), floor()
        System.out.println("Ceiling of 25: " + set.ceiling(25));
        System.out.println("Floor of 25: " + set.floor(25));

        // 10. addAll()
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(60);
        set2.add(70);

        set.addAll(set2);
        System.out.println("After addAll(): " + set);

        // 11. removeAll()
        set.removeAll(set2);
        System.out.println("After removeAll(): " + set);

        // 12. retainAll()
        set.add(60);
        set.add(70);
        set.retainAll(set2);
        System.out.println("After retainAll(): " + set);

        // 13. descendingSet()
        System.out.println("Descending: " + set.descendingSet());

        // 14. pollFirst() & pollLast()
        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last: " + set.pollLast());

        // 15. clone()
        TreeSet<Integer> clone = (TreeSet<Integer>) set.clone();
        System.out.println("Cloned: " + clone);

        // 16. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 17. isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());
    }
}