package CollectionFrameworks.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseAStack {
    private static void pushAtBottom(Stack<Integer> s, int data) {
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        //Recursion
        int prev = s.pop();
        pushAtBottom(s, data);
        s.push(prev);
    }

    private static void reverse(Stack<Integer> stack){
        //base case
        if(stack.isEmpty()){
            return;
        }
        //recursion
        int digit = stack.pop();
        reverse(stack);
        pushAtBottom(stack, digit);
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        stack.addAll(list);

        reverse(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
