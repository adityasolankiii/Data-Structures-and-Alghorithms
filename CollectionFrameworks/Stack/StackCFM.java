package CollectionFrameworks.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackCFM {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Stack<Integer> stack1 = new Stack<>();
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        stack1.addAll(l1);

        System.out.println(stack.peek()+ "\n===========");

        while(!stack1.isEmpty()){
            System.out.println(stack1.peek());
            stack1.pop();
        }
    }
}
