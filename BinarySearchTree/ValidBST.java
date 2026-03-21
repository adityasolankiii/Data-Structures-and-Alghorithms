package BinarySearchTree;

import static BinarySearchTree.BinarySearchTree.insert;

public class ValidBST extends Traversal{

    public static void isValidBST(Node root) {
        System.out.println(isValidBST(root, null, null));
    }

    private static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false;
        }

        if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};

        Node root = null;

        for(int value : values) {
            root=insert(root, value);
        }

        isValidBST(root);
    }
}
