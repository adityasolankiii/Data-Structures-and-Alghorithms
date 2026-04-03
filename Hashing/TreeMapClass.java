package Hashing;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer, Object> map = new TreeMap<>();

        map.put(1,"Aditya");
        map.put(2, 2);
        map.put(3, 100);

        Set<Integer> keySet = map.keySet();

        for(Integer key: keySet) {
            System.out.println(key+" "+map.get(key));
        }
    }
}