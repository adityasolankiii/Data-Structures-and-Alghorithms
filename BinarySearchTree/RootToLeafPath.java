package BinarySearchTree;

import java.util.ArrayList;

import static BinarySearchTree.BinarySearchTree.insert;

public class RootToLeafPath extends Traversal {
    static void getPathsToLeafs(Node root, ArrayList<Integer> list) {

        //base case
        if (root == null) return;

        list.add(root.data);

        if(root.left == null && root.right == null) {
            System.out.println(list);
        }

        getPathsToLeafs(root.left, list);
        getPathsToLeafs(root.right, list);
        list.removeLast();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] values = {5,1,3,4,2,7};

        Node root = null;

        for(int value : values) {
            root=insert(root, value);
        }

        getPathsToLeafs(root, list);
    }
}
