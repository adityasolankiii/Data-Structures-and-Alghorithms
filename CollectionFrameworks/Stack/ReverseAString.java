package CollectionFrameworks.Stack;

import java.util.Stack;

public class ReverseAString {
    private static void reverse(String str){
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

        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str = "Aditya";
        reverse(str);
    }
}
