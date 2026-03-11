package BinaryTrees;

public class BinaryTreeDiameter extends BinaryTree{

    // Approach - 1 - O(n^2)
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


    //Approach - 2 - O(n)
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public Info diameter2(Node root) {
        if(root == null) {
            return new Info(0,0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }


    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeDiameter tree = new BinaryTreeDiameter();
        Node root = tree.buildTree(nodes);

        System.out.println("Diameter of a Tree: Approach 1");
        System.out.println(tree.diameter(root));

        System.out.println("\n\nDiameter of a Tree: Approach 2");
        System.out.println(tree.diameter2(root).diam);
    }
}
