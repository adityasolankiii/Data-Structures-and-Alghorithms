package BinaryTrees;

public class BinaryTreeDiameter extends BinaryTree{

    // Approach - 1
    public int diameter(Node root) {
        if(root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int leftHeight = height(root.left);

        int rightDiameter = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeDiameter tree = new BinaryTreeDiameter();
        Node root = tree.buildTree(nodes);

        System.out.println("Diameter of a Tree: Approach 1");
        System.out.println(tree.diameter(root));
    }
}
