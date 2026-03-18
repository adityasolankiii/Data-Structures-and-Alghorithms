package BinaryTrees;

public class TransformToSumTree extends BinaryTree {
    public static int transform(Node root) {
        if(root == null) return 0;

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int leftData = root.left == null ? 0 : root.left.data;
        int rightData = root.right == null ? 0 : root.right.data;

        root.data = leftData + leftChild + rightData + rightChild;

        return data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BinaryTree tree = new BinaryTree();
        System.out.println("Before");

        tree.preOrderTraversal(root);

        transform(root);

        System.out.println("\nAfter");
        tree.preOrderTraversal(root);
    }
}
