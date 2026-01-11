package Array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void reverse(int[] arr){
        int first = 0, last = arr.length - 1;

        while(first<last){
            arr[first] = arr[first] + arr[last];
            arr[last] = arr[first] - arr[last];
            arr[first] = arr[first] - arr[last];

            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {3,5,1,6,8};
        reverse(arr);
    }
}
