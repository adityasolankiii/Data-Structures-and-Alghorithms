package CollectionFrameworks.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PushAtBottom {
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

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        s.addAll(list);

        pushAtBottom(s, 4);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
