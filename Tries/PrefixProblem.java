/*
Find the shortest unique prefix for every word in a given list.
Assume no word is prefix of another.

arr[] = {"zebra", "dog", "duck", "dove"};
ans = {"z", "dog", "du", "dov"};
*/

package Tries;

import java.util.Arrays;

public class PrefixProblem {
    private static class Node {
        Node[] children =  new Node[26];
        boolean eow;
        int freq;

        public Node() {
            Arrays.fill(children, null);
            eow = false;
            freq = 1;
        }
    }

    private static final Node root = new Node();

    private static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    
    private static void findPrefix(Node root, String ans) {
        if(root == null) {
            return;
        }

        if(root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans+(char) (i+'a'));
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};

        for(String word : words) {
            insert(word);
        }

        root.freq = -1;
        findPrefix(root, "");
    }
}