package CollectionFrameworks;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1,"Aditya");
        students.put(2,"Mihir");

        System.out.println(students);

        for (Map.Entry<Integer,String> entry : students.entrySet()){
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}
