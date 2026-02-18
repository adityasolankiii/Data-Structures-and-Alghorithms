package CollectionFrameworks.LinkedList;

public class DoublyLinkedList {

    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;
            this.prev = null;
        }

    }

    public int size;
    private Node head;
    private Node tail;

    /***
     * This method will add data at first in linked list
     * @param data int
     */
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    /***
     * This method will add data at last in linked list
     * @param data int
     */
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step-2 : tail.next = newNode
        tail.next = newNode;
        newNode.prev = tail;

        //Step-3 : newNode = tail
        tail = newNode;

    }

    /***
     * This method will remove first element from a Linked List
     * @return removed element
     */
    public int removeFirst(){
        if(head == null){
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int el = head.data;
            head = null;
            size = 0;
            return el;
        }

        int el = head.data;
        head = head.next;
        size--;
        head.prev = null;
        return el;
    }

    /***
     * This method will remove last element from a Linked List
     * @return removed element
     */
    public int removeLast(){
        if(head == null){
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int el = head.data;
            head = null;
            size = 0;
            return el;
        }

        int el = tail.data;
        tail = tail.prev;
        size--;
        tail.next = null;
        return el;
    }

    /***
     * This method will print LinkedList
     */
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        System.out.println("Head "+ll.head.data);
        System.out.println("Tail "+ll.tail.data);
        ll.print();

//        ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println("Tail "+ll.tail.data);
    }
}
