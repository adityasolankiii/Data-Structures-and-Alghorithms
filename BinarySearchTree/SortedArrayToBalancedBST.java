package BinarySearchTree;

public class SortedArrayToBalancedBST extends Traversal {

    static Node build (int[] arr, int start, int end) {
        if(start > end) return null;

        int mid = start + (end - start) / 2;
        Node root = new Node(arr[mid]);

        root.left = build(arr, start, mid-1);
        root.right = build(arr, mid+1, end);

        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Node root = build(arr, 0, arr.length-1);

        inOrder(root);
    }
}
