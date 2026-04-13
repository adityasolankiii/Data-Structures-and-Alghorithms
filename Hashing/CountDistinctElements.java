package Hashing;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] nums = {4,5,3,1,2,6,7,8,4,3,2,1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        System.out.println(set.size());
    }
}
