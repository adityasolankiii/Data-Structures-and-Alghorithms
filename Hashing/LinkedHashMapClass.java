package Hashing;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();

        map.put(null,null);
        map.put(1,"Aditya");
        map.put('a', 2);
        map.put(null, 2);

        Set<Object> keySet = map.keySet();

        for(Object key: keySet) {
            System.out.println(key+" "+map.get(key));
        }
    }
}
