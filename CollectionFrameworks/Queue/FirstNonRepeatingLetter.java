package CollectionFrameworks.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingLetter {

    private static char find(String str){
        Queue<Character> q = new ArrayDeque<>();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int idx = c - 'a';
            if(freq[idx] < 2){
                q.add(c);
            }
            freq[idx] += 1;
        }

        while (!q.isEmpty()) {
            char c = q.remove();
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '0';
    }

    public static void main(String[] args){
        System.out.print("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("First non repeating character : " + find(input));
    }
}
