package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

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

    /***
     * Pre-Order Traversal
     * <ul>
     *     <li>left</li>
     *     <li>root</li>
     *     <li>right</li>
     * </ul>
     * @param root Node
     */
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


    /***
     * In-Order Traversal
     * <ul>
     *     <li>left</li>
     *     <li>root</li>
     *     <li>right</li>
     * </ul>
     * @param root Node
     */
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



    /***
     * Post-Order Traversal
     * <ul>
     *     <li>left</li>
     *     <li>right</li>
     *     <li>root</li>
     * </ul>
     * @param root Node
     */
    public void postOrderTraversal(Node root) {
        //base case
        if(root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }


    /***
     * Level-Order Traversal
     * <p>Iterative</p>
     */
    public void levelOrderTraversal(Node root) {
        if(root == null) return;

        //Queue
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }

                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    /***
     * Sum of Nodes
     * @param root Node
     * @param sum Node
     * @return total sum of nodes
     */
    public int sum(Node root, int sum) {
        //base case
        if(root == null){
            return 0;
        }

        //recursion
        int leftSum = sum(root.left, sum);
        int rightSum = sum(root.right, sum);

        return root.data+leftSum+rightSum;
    }


    public int height(Node root) {
        //base case
        if(root == null) {
            return 0;
        }

        //recursion
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh) + 1;
    }
}

public class BuildTreePreOrder {
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);

        System.out.println("Pre-Order Traversal");
        tree.preOrderTraversal(root);
        System.out.println("\n\nIn-Order Traversal");
        tree.inOrderTraversal(root);
        System.out.println("\n\nPost-Order Traversal");
        tree.postOrderTraversal(root);
        System.out.println("\n\nLevel-Order Traversal");
        tree.levelOrderTraversal(root);
        System.out.println("\n\nSum of Nodes");
        System.out.println(tree.sum(root,0));
        System.out.println("\n\nHeight of tree");
        System.out.println(tree.height(root));
    }
}