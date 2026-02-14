package CollectionFrameworks.LinkedList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    /***
     * This method will add data at first in linked list
     * @param data int
     */
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

    /***
     * This method will add data at last in linked list
     * @param data int
     */
    private void addLast(int data){
        //Step-1 : create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step-2 : tail.next = newNode
        tail.next = newNode;

        //Step-3 : newNode = tail
        tail = newNode;
    }

    private void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);


        ll.print();
    }
}
