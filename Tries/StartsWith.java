/*
 Create a function boolean startsWith(String prefix) for a trie.
 Return true if there is a previously inserted string word that has the prefix, and false otherwise.
 word[] = { "apple", "app", "mango", "man", "woman" }
 prefix = "app"         output = true
 prefix = "moon"        output = false
*/

package Tries;
import static Tries.Trie.*;

public class StartsWith {
    private static boolean startsWith(String prefix) {
        Node curr = root;

        for(int i=0; i< prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = { "apple", "app", "mango", "man", "woman" };

        for(String word : words) {
            Trie.insert(word);
        }

        String prefix1 = "app";
        String prefix2 = "app";
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
