package CollectionFrameworks;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(); //Not Sorted
//        Set<Integer> nums = new TreeSet<>(); //Sorted
        nums.add(51);
        nums.add(48);
        nums.add(36);
        nums.add(60);

        System.out.println(nums);


        Iterator<Integer> numsValue = nums.iterator();

        while(numsValue.hasNext()) {
            System.out.println(numsValue.next());
            numsValue.remove();
        }


        System.out.println(nums);
    }
}
