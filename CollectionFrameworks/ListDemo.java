package CollectionFrameworks;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.getClass());
        System.out.println(nums.get(2));  //ArrayList, LinkedList, Vector and Stack Supports get()
        System.out.println(nums);

        for(Object num : nums){
            System.out.println(num);
            System.out.println(num.getClass());
        }
    }
}
