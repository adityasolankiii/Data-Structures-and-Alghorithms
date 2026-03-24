package BinaryTrees;

public class MaximumPathSum extends BinaryTree {
    static int maxSum = Integer.MIN_VALUE;

    private static int getSum(Node root) {
        if(root == null) return 0;

        int left = Math.max(0, getSum(root.left));
        int right = Math.max(0, getSum(root.right));

        int max_single = Math.max(Math.max(left, right) + root.data, root.data);

        int max_top = Math.max(max_single, left + right + root.data);

        maxSum = Math.max(max_top, maxSum);

        return max_single;
    }

    public static int maxPathSum(Node root) {
        getSum(root);
        return maxSum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(maxPathSum(root));
    }
}
