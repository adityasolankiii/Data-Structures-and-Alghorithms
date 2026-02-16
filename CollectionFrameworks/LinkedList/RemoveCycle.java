package CollectionFrameworks.LinkedList;

public class RemoveCycle extends FloydsCycleFindingAlgorithm{

    public void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(!cycle){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = fast;
        while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle
        tail = prev;
        prev.next = null;
    }

    public static void main(String[] args) {
        RemoveCycle ll = new RemoveCycle();

        ll.head = new Node(1);
        Node temp = new Node(2);
        ll.head.next = temp;
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = temp;
//        ll.print();

        System.out.println(ll.isCycle());
        System.out.println("After Removing a Cycle");
        ll.removeCycle();
        ll.print();
    }
}
