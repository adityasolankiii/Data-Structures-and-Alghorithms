package BinaryTrees;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree {
    static int idx = -1;
    public Node buildTree(int[] nodes) {
        idx++;
        if(nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public void preOrderTraversal(Node root) { // O(n)
        //base case
        if(root == null) {
            // System.out.print(-1+" ");
            return;
        }
        //recursion
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(Node root) {
        //base case
        if(root == null) {
            return;
        }

        //recursion
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
}

public class BuildTreePreOrder {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.preOrderTraversal(root);
        System.out.println();
        tree.inOrderTraversal(root);
    }
}