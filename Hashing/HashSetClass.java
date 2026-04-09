package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {

        // 1. Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // 2. add(E e)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate (ignored)

        System.out.println("After add(): " + set);

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. contains(Object o)
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 50? " + set.contains(50));

        // 5. remove(Object o)
        set.remove(20);
        System.out.println("After remove(20): " + set);

        // 6. isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // 7. iterator()
        System.out.println("Using Iterator:");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 8. addAll(Collection c)
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(50);

        set.addAll(set2);
        System.out.println("After addAll(): " + set);

        // 9. removeAll(Collection c)
        set.removeAll(set2);
        System.out.println("After removeAll(): " + set);

        // 10. retainAll(Collection c)
        set.add(40);
        set.add(50);

        set.retainAll(set2); // keeps only common elements
        System.out.println("After retainAll(): " + set);

        // 11. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 12. isEmpty() after clear
        System.out.println("Is Empty now? " + set.isEmpty());

        // 13. clone()
        HashSet<Integer> original = new HashSet<>();
        original.add(1);
        original.add(2);

        HashSet<Integer> cloned = (HashSet<Integer>) original.clone();
        System.out.println("Cloned Set: " + cloned);

        // 14. equals()
        System.out.println("original equals cloned? " + original.equals(cloned));

        // 15. toArray()
        Object[] arr = original.toArray();
        System.out.println("Array elements:");
        for(Object obj : arr) {
            System.out.println(obj);
        }
    }
}