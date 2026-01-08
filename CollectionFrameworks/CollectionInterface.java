package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.getClass());
        System.out.println(nums);

        for(Object num : nums){
            System.out.println(num);
            System.out.println(num.getClass());
        }
    }
}
