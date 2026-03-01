package CollectionFrameworks.Queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
    static class Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        /*
        public static boolean isEmpty(){
            return stack1.isEmpty();
        }

        public static void add(int data){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }

            stack1.push(data);

            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        public static int peek(){
            return stack1.peek();
        }

        public  static int pop(){
            return stack1.pop();
        }

        */
        public static void add(int x) {
            stack1.push(x);
        }

        public static int pop() {
            transfer();
            return stack2.pop();
        }

        public static int peek() {
            transfer();
            return stack2.peek();
        }

        public static boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

        private static void transfer() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }

    }

    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);

        System.out.println(Queue.peek());
        System.out.println(Queue.pop());
        System.out.println(Queue.peek());
        System.out.println(Queue.isEmpty());
    }
}
