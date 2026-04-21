package Hashing;

import java.util.HashMap;

public class LargestSubArrayWithSumZero {
    public static void main(String[] args) {
        int[] arr = {0, -2, 2, -8, 1, 7, 10};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;

        for(int j=0;j<arr.length; j++) {
            sum+=arr[j];

            if(sum==0) len=j+1;

            if(!map.containsKey(sum)) {
                map.put(sum, j);
            } else {
                len = Math.max(len, j - map.get(sum));
            }
        }

        System.out.println(len);
    }
}
