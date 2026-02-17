package CollectionFrameworks.LinkedList;

public class ZigZagLL extends LinkedList{
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void zigZag(){
        // get middle node
        Node mid = getMid(head);

        // reverse the second half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        Node nextLeft, nextRight;

        // merge both ll in zig zag format
        while (left != null && right != null){

            // Zig Zag merge
            nextLeft = left.next;
            left.next = right;

            nextRight = right.next;
            right.next = nextLeft;

            // update right and left
            right = nextRight;
            left = nextLeft;
        }
    }

    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

       ll.print();
       ll.zigZag();
       ll.print();
    }
}
