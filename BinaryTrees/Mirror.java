package BinaryTrees;

public class Mirror extends BinaryTree {
    public static Node mirror(Node node) {
        //base case
        if(node == null) {
            return node;
        }

        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    public static void main(String[] args) {
        BinaryTree m = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Before Mirror");
        m.inOrderTraversal(root);
        root = mirror(root);
        System.out.println("\nAfter Mirror");
        m.inOrderTraversal(root);

    }
}
