package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfBinaryTree extends BinaryTree{

    static class Info {
        Node node;
        int horDist;

        public Info(Node node, int horizontalDistance) {
            this.node = node;
            this.horDist = horizontalDistance;
        }
    }

    public static void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()) {
            Info curr = q.remove();

            if(curr == null) {
                if(q.isEmpty())  {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.horDist)) { // first time horizontal distance is occurring
                    map.put(curr.horDist, curr.node);
                }

                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.horDist-1));
                    min = Math.min(min, curr.horDist-1);
                }

                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.horDist+1));
                    max = Math.max(max, curr.horDist+1);
                }
            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}
