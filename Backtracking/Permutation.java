package Backtracking;

import java.util.Arrays;

public class Permutation {
    static int count;
    public static void find(String str, String ans) {
        //base case
        if(str.isEmpty()){
            System.out.println(ans);
            count++;
            return;
        }

        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            //handling repeating characters
            if(i>0 && curr == str.charAt(i-1)){
                continue;
            }

            String newStr = str.substring(0,i) + str.substring(i+1);
            find(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "rrrddd";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        find(new String(arr), "");
        System.out.println(count);
    }
}
