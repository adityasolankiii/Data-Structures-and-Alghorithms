package BinarySearchTree;

public class ReverseBST extends Traversal {
    public static Node mirror(Node root) {
        if(root == null) return root;

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        System.out.println("Before Mirror");
        preOrder(root);
        System.out.println("\nAfter Mirror");
        root = mirror(root);
        preOrder(root);
    }
}
