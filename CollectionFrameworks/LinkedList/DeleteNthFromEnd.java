package CollectionFrameworks.LinkedList;

public class DeleteNthFromEnd extends LinkedList{

    public void deleteNthFromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(head == null){
            System.out.print("List is Empty! - ");
            return;
        }

        if(n == size){
            head = head.next;
            return;
        }

        Node prev = head;
        for (int i = 1; i < size-n; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        DeleteNthFromEnd ll = new DeleteNthFromEnd();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();
        ll.deleteNthFromEnd(2);
        ll.print();
    }
}
