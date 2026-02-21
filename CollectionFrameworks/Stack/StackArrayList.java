package CollectionFrameworks.Stack;

import java.util.ArrayList;

public class StackArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        private static boolean isEmpty(){
//            return list.size() == 0;
            return list.isEmpty();
        }

        //push
        private static void push(int data){
            list.add(data);
        }

        //pop
        private static int pop(){
            return list.removeLast();
        }

        //peek
        private static int peek(){
            return list.getLast();
        }
    }

    public static void main(String[] args) {
        System.out.println("Before Push");
        System.out.println(Stack.isEmpty());
        System.out.println("After Push");
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        System.out.println(Stack.isEmpty());
        System.out.println("Peek() - " + Stack.peek());
        Stack.pop();
        System.out.println("After pop() - " + Stack.peek());
    }
}
