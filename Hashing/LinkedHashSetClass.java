package Hashing;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetClass {
    public static void main(String[] args) {

        // 1. Create LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // 2. add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate ignored
        set.add(null);

        System.out.println("After add(): " + set);

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. contains()
        System.out.println("Contains 20? " + set.contains(20));

        // 5. remove()
        set.remove(20);
        System.out.println("After remove(): " + set);

        // 6. iterator()
        System.out.println("Using Iterator:");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 7. addAll()
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(40);
        set2.add(50);

        set.addAll(set2);
        System.out.println("After addAll(): " + set);

        // 8. removeAll()
        set.removeAll(set2);
        System.out.println("After removeAll(): " + set);

        // 9. retainAll()
        set.add(40);
        set.add(50);
        set.retainAll(set2);
        System.out.println("After retainAll(): " + set);

        // 10. clone()
        LinkedHashSet<Integer> clone = (LinkedHashSet<Integer>) set.clone();
        System.out.println("Cloned: " + clone);

        // 11. equals()
        System.out.println("Equals clone? " + set.equals(clone));

        // 12. toArray()
        Object[] arr = set.toArray();
        System.out.println("Array:");
        for(Object obj : arr) {
            System.out.println(obj);
        }

        // 13. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 14. isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());
    }
}