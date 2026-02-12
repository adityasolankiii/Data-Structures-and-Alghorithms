package CollectionFrameworks.LinkedList;

public class LinkedListPractices {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;

        private void addFirst(int data){
            //Step-1 : create new node
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            //Step-2 : newNode.next = head
            newNode.next = head;

            //Step-3 : head = newNode
            head = newNode;
        }
    }

    public static void main(String[] args) {
        Li
    }
}
