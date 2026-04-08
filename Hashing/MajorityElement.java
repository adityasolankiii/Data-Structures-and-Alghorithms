package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/***
 * Given an integer array of size n, find all elements that appear more than [n/3] times.<br>
 * nums[] = {1,3,2,5,1,3,1,5,1}<br>
 * output = 1;<br><br>
 * nums[] = {1,2}<br>
 * output = 1,2
 */
public class MajorityElement {
    public static void main(String[] args) {
//        int[] nums = {1,3,2,5,1,3,1,5,1};
        int[] nums = {1,3,5,5,1,3,1,5,1};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> keys = map.keySet();

        for(int key : keys) {
            if(map.get(key) > (nums.length/3)) {
                System.out.print(key+" ");
            }
        }
    }
}
