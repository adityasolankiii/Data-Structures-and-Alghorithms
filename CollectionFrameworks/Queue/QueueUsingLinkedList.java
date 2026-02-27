package CollectionFrameworks.Queue;


class Node {
    Object data;
    Node next;
    public Node(Object data){
        this.data = data;
        this.next = null;
    }
}

class QueueLL {
    private Node front, rear;

    //add
    public void add(Object data) {
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    //remove
    public Object remove(){
        if(front == null) return null;

        Object data = front.data;
        front = front.next;
        if (front == null) rear = null;

        return data;
    }

    //display
    public void display(){
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : " -> null\n"));
            temp = temp.next;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        return front == null && rear == null;
    }

    //peek
    public Object peek(){
        return front != null ? front.data : null;
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.add(1);
        queue.add("Aditya");
        queue.add(16);

        queue.display();
        Object data = queue.remove();
        queue.display();
        System.out.println("Removed : "+data);

        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

    }
}
