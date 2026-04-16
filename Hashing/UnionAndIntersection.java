package Hashing;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {3,6,9,2,4,9};

        HashSet<Integer> set = new HashSet<>();

        //union
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);

        System.out.println("Union Set"+set);

        //Intersect
        set.clear();

        for (int num : arr1) set.add(num);
        int count = 0;
        System.out.print("Intersection [");

        for (int num : arr2) {
            if (set.contains(num)) {
                count++;
                set.remove(num);
                System.out.print(num+", ");
            }
        }
        System.out.println("]");
        System.out.println("\nIntersection "+count);
    }
}
