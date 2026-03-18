package BinarySearchTree;

public class BinarySearchTree extends Traversal{

    public static Node insert(Node root, int val) {
        if(root == null) {
            return new Node(val);
        }

        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};

        Node root = null;

        for(int value : values) {
            root=insert(root, value);
        }

        inOrder(root);
    }
}
