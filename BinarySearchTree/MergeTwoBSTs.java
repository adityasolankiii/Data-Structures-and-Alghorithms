package BinarySearchTree;

import java.util.ArrayList;

public class MergeTwoBSTs extends Traversal {
    public static void getInorder(Node root, ArrayList<Integer> nodes) {
        if(root == null) return;

        getInorder(root.left, nodes);
        nodes.add(root.data);
        getInorder(root.right, nodes);
    }

    public static Node mergeBSTs(Node root1, Node root2) {
        //step-1 get inorder for root1
        ArrayList<Integer> list1 = new ArrayList<>();
        getInorder(root1, list1);

        //step-2 get inorder for root2
        ArrayList<Integer> list2 = new ArrayList<>();
        getInorder(root2, list2);

        //merge
        int i=0, j=0;
        ArrayList<Integer> mergedList = new ArrayList<>();
        while (i<list1.size() && j< list2.size()) {
            if(list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i<list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j<list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return buildBST(mergedList,0, mergedList.size()-1);
    }

    private static Node buildBST(ArrayList<Integer> list, int start, int end) {
        int mid = start+(end-start)/2;
        if(start>end) return null;
        Node root = new Node(list.get(mid));
        root.left = buildBST(list, start, mid-1);
        root.right = buildBST(list, mid+1, end);

        return root;
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node mergedRoot = mergeBSTs(root1, root2);
        preOrder(mergedRoot);
    }
}
