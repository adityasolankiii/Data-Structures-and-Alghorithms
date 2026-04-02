package Hashing;

import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {

        // 1. Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. put() - Insert elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        System.out.println("Initial Map: " + map);

        // 3. get() - Get value
        System.out.println("Value for key 2: " + map.get(2));

        // 4. containsKey()
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 5. containsValue()
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // 6. remove()
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // 7. size()
        System.out.println("Size of map: " + map.size());

        // 8. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // 9. keySet()
        System.out.println("Keys: " + map.keySet());

        // 10. values()
        System.out.println("Values: " + map.values());

        // 11. entrySet()
        System.out.println("Entries: " + map.entrySet());

        // 12. Iterating using entrySet
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 13. putIfAbsent()
        map.putIfAbsent(3, "Orange"); // won't replace
        map.putIfAbsent(5, "Orange"); // will add
        System.out.println("After putIfAbsent: " + map);

        // 14. replace()
        map.replace(2, "Grapes");
        System.out.println("After replace: " + map);

        // 15. replace(key, oldValue, newValue)
        map.replace(3, "Cherry", "Pineapple");
        System.out.println("After conditional replace: " + map);

        // 16. getOrDefault()
        System.out.println("Get key 10 (default): " + map.getOrDefault(10, "Not Found"));

        // 17. clear()
        map.clear();
        System.out.println("After clear(): " + map);

        // 18. putAll()
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "A");
        newMap.put(2, "B");

        map.putAll(newMap);
        System.out.println("After putAll(): " + map);
    }
}