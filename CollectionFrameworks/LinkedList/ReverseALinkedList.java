package CollectionFrameworks.LinkedList;

public class ReverseALinkedList extends LinkedList{

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverseALinkedList ll = new ReverseALinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);


        System.out.println("Before Reverse");
        ll.print();
        System.out.println("After Reverse");
        ll.reverse();
        ll.print();
    }
}
