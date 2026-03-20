package BinarySearchTree;

import static BinarySearchTree.BinarySearchTree.insert;

public class PrintInRange extends Traversal{
    static void printRange(Node root, int n1, int n2) {
        if(root == null) return;

        if(root.data >= n1 && root.data <= n2) {
            printRange(root.left, n1, n2);
            System.out.print(root.data+" ");
            printRange(root.right, n1, n2);
        } else if (root.data < n1) {
            printRange(root.left, n1, n2);
        } else {
            printRange(root.right, n1, n2);
        }

    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};

        Node root = null;

        for(int value : values) {
            root=insert(root, value);
        }

        printRange(root,1,5);
    }
}
