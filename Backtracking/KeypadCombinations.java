package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class KeypadCombinations {
    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
            {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
            {'t','u','v'},{'w','x','y','z'}};

    public static void letterCombination(String D){
        if(D.isEmpty()){
            System.out.println();
            return;
        }
        bfs(0, D.length(), new StringBuilder(), D);
    }

    public static void bfs(int pos, int length, StringBuilder sb, String D){
        if(pos==length){
            System.out.println(sb.toString());
            return;
        }

        char[] letters = L[Character.getNumericValue(D.charAt(pos))];
        for (char letter : letters) {
            bfs(pos + 1, length, new StringBuilder(sb.append(letter)), D);
        }
    }


    /*  digits = "23 - "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" */
    static String[] keypad = {
            "",     "",     "abc", "def",
            "ghi", "jkl", "mno", "pqrs",
            "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;   // empty input → empty output
        }

        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(int index, String digits, StringBuilder current, List<String> result) {
        // Base case: if the current string length == number of digits
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get digit and its corresponding characters
        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        // Try all possible letters
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(index + 1, digits, current, result);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }



    public static void main(String[] args) {
        letterCombination("23");

        System.out.println();
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations("2"));
        System.out.println(letterCombinations(""));


    }
}
