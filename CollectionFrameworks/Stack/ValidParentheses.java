package CollectionFrameworks.Stack;

import java.util.*;

public class ValidParentheses {

    private static boolean validate(String str){

        /*
        ArrayDeque: This is generally the fastest and most memory-efficient way to
                    implement a stack in a single-threaded environment.
                    It is a resizable-array implementation that does not have the
                    overhead of synchronization.
         */
//        Deque<Character> stack = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '[') stack.push(']');
            else if(str.charAt(i) == '(') stack.push(')');
            else if(str.charAt(i) == '{') stack.push('}');
            else if(stack.isEmpty() || stack.pop() != str.charAt(i)) return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(){}[])";
        String str1 = "(){}[]";
        System.out.println(str+" - "+validate(str));
        System.out.println(str1+" - "+validate(str1));
    }
}
