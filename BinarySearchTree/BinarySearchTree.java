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

    public static boolean search (Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete (Node root, int val) {
        if(val < root.data) root.left = delete(root.left, val);
        else if (val > root.data) root.right = delete(root.right, val);
        else {
            // case 1 - No child (leaf node)
            if(root.left == null && root.right == null) {
                return null;
            }

            // case 2 - one child
            if(root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3 - Two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    private static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
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
        boolean ans = search(root, 8);
        if (ans) {
            System.out.println("\nKey found!");
        } else {
            System.out.println("\nNot found!");
        }

        System.out.println("Before Delete");
        inOrder(root);
        delete(root, 5);
        System.out.println("\nAfter Delete");
        inOrder(root);
    }
}
