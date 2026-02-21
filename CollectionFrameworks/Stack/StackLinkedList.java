package CollectionFrameworks.Stack;

public class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        //isEmpty
        private static boolean isEmpty(){
            return head == null;
        }

        //push
        private static void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        private static int pop(){
            if(isEmpty()){
                return Integer.MIN_VALUE;
            }

            int data = head.data;
            head = head.next;

            return data;
        }

        //peek()
        private static int peek(){
            if (isEmpty()){
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        System.out.println("Before Push");
        System.out.println(Stack.isEmpty());
        System.out.println("After Push");
        Stack.push(1);
//        Stack.push(2);
//        Stack.push(3);
        System.out.println(Stack.isEmpty());
        System.out.println("Peek(): " + Stack.peek());
        Stack.pop();
        System.out.println("After pop(): " + Stack.peek());
    }
}