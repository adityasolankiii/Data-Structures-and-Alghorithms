package CollectionFrameworks.LinkedList;

public class FloydsCycleFindingAlgorithm extends LinkedList{

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        FloydsCycleFindingAlgorithm ll = new FloydsCycleFindingAlgorithm();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
//        ll.head.next.next.next = ll.head;

        System.out.println(ll.isCycle());
    }
}
