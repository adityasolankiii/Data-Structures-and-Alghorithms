package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0)+1);
        }

        for(int i=0; i<str2.length(); i++) {
            char ch = str2.charAt(i);
            if(!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagram(str1, str2));
    }
}
