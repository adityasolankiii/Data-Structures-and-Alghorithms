package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ConvertBSTToBalancedBST extends Traversal{

    private void getListHelper(Node root, List<Integer> result) {
        if(root == null) return;

        getListHelper(root.left, result);
        result.add(root.data);
        getListHelper(root.right, result);
    }

    private ArrayList<Integer> getList(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        getListHelper(root, result);
        return result;
    }

    private Node createBST(ArrayList<Integer> list, int start, int end) {
        if(start > end) return null;

        int mid = start + (end - start) / 2;

        Node root = new Node(list.get(mid));

        root.left = createBST(list, start, mid-1);
        root.right = createBST(list, mid+1, end);

        return root;
    }

    public Node balanceBST(Node root) {
        ArrayList<Integer> result = getList(root);
        return createBST(result, 0, result.size()-1);
    }

    public static void main(String[] args) {
        ConvertBSTToBalancedBST obj = new ConvertBSTToBalancedBST();

        Node root = new Node(4);

        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.left.left= new Node(1);

        root.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        System.out.println("Before");
        preOrder(root);

        root = obj.balanceBST(root);

        System.out.println("\nAfter");
        preOrder(root);
    }
}
