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

    public int size;
    public Node head;
    public Node tail;

    /***
     * This method will add data at first in linked list
     * @param data int
     */
    public void addFirst(int data){
        //Step-1 : create new node
        Node newNode = new Node(data);
        size++;
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
    public void addLast(int data){
        //Step-1 : create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step-2 : tail.next = newNode
        tail.next = newNode;

        //Step-3 : newNode = tail
        tail = newNode;

    }

    /***
     * this method will add data to particular index in linkedlist
     * @param index int
     * @param data int
     */
    public void add(int index, int data){
        if(index < 0 || index > size){
            System.out.println("Invalid Index");
            return;
        }

        if(index == 0){
            addFirst(data);
            return;
        }

        if(index == size){
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        size++;

        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    /***
     * This method will remove first element from a LinkedList
     */
    public int removeFirst(){

        if(head == null){
            System.out.println("Linked List is Empty!");
            return Integer.MIN_VALUE;
        } else if(head == tail){
            int element = head.data;
            head = tail = null;
            size = 0;
            return element;
        }

        int element = head.data;
        head = head.next;
        size--;
        return element;
    }

    /***
     * This method will remove last element from a LinkedList
     */
    public int removeLast(){

        if(head == null){
            System.out.println("Linked List is Empty!");
            return Integer.MIN_VALUE;
        } else if(head == tail){
            int element = head.data;
            head = tail = null;
            size = 0;
            return element;
        }

        int element = tail.data;

        Node temp = head;
        size--;
        while (temp.next != tail){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        return element;
    }

    /**
     * Searches for the specified key in the LinkedList.
     *
     * @param key the element to be searched in the list
     * @return the index of the key if found, otherwise -1
     */
    public int search(int key){
        int index = 0;
        if(head == null) return -1;
        Node temp = head;
        while(temp != null){
            if(key == temp.data) return index;
            temp = temp.next;
            index++;
        }

        return -1;
    }

    /***
     * This method will print LinkedList
     */
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,5);


        ll.print();
        System.out.println("Size : " + ll.size);

        System.out.println("=======First Element=======");
        int first = ll.removeFirst();

        ll.print();
        System.out.println("First Element : "+first);
        System.out.println("Size : " + ll.size);

        System.out.println("=======Last Element=======");

        int last = ll.removeLast();

        ll.print();
        System.out.println("Last Element : "+last);
        System.out.println("Size : " + ll.size);

        System.out.println("=======Search Element=======");
        System.out.println(ll.search(2));
    }
}
