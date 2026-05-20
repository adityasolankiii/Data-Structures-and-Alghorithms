/*
* Given a string of length n of lowercase alphabet characters,
* we need to count total number of distinct substring of this
* string.
* str = "ababa";
* ans = 10;
* */

/*
* 1) find all suffix of string
* 2) create TRIE + Insert
* 3) count nodes of Trie
* */
package Tries;

public class CountUniqueSubstrings {

    public static int countNodes(Trie.Node root) {
        if(root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }

        return count+1;
    }

    public static void main(String[] args) {
//        String str = "ababa";
        String str = "apple";

        // find all suffixes -> insert in trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            Trie.insert(suffix);
        }

        System.out.println(countNodes(Trie.root));
    }
}
