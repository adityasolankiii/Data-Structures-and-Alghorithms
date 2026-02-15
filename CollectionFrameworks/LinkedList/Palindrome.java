package CollectionFrameworks.LinkedList;

public class Palindrome extends LinkedList{

    //slow-fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while( fast != null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1 - Find mid
        Node midNode = findMid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head; //left half head

        //step 3 - check left half and right half
        while (right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);


        System.out.println(ll.isPalindrome());
    }
}
