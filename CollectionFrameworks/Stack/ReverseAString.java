package CollectionFrameworks.Stack;

import java.util.Stack;

public class ReverseAString {
    private static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder newStr = new StringBuilder();
        int i = 0;
        while (i<str.length()){
            char c = str.charAt(i);
            stack.push(c);
            i++;
        }

        while (!stack.isEmpty()){
            newStr.append(stack.pop());
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "Aditya";
        System.out.println(reverse(str));
    }
}
