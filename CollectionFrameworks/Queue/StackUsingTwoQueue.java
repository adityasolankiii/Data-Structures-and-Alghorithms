package CollectionFrameworks.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {

    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        /*
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop(){
            int last = Integer.MIN_VALUE;

            if(q2.isEmpty()){
                while(!q1.isEmpty()){
                    last = q1.remove();
                    if(q1.isEmpty()){
                        return last;
                    }
                    q2.add(last);
                }
            } else {
                while(!q2.isEmpty()){
                    last = q2.remove();
                    if(q2.isEmpty()){
                        return last;
                    }
                    q1.add(last);
                }
            }

            return last;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }

            int last = Integer.MIN_VALUE;

            if(q2.isEmpty()){
                while(!q1.isEmpty()){
                    last = q1.remove();
                    q2.add(last);
                }
            } else {
                while(!q2.isEmpty()){
                    last = q2.remove();
                    q1.add(last);
                }
            }

            return last;
        }
        */

        public static void push(int x) {
            /*q2.add(x);
            while(!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;*/

            q1.add(x);

            for(int i=0;i<q1.size()-1;i++){
                q1.add(q1.remove());
            }
        }

        public static int pop() {
            return q1.remove();
        }

        public static int peek() {
            return q1.peek();
        }

        public static boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {

        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println("Peek: " + Stack.peek());  // 3
        System.out.println("Pop:  " + Stack.pop());   // 3

        System.out.println("Peek: " + Stack.peek());  // 2
        System.out.println("Pop:  " + Stack.pop());   // 2

        System.out.println("Peek: " + Stack.peek());  // 1
        System.out.println("Pop:  " + Stack.pop());   // 1

        System.out.println("Is Empty? " + Stack.isEmpty()); // true

        Stack.push(10);
        Stack.push(20);

        System.out.println("Peek: " + Stack.peek());  // 20
        System.out.println("Pop:  " + Stack.pop());   // 20

        System.out.println("Peek: " + Stack.peek());  // 10
    }
}
