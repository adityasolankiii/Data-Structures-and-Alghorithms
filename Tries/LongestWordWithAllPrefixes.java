/*
* Find the longest string in words such that every prefix of it is also in words.
* words = ["a", "banana", "app", "appl", "ap", "apply", "apple"];
* ans = "apple";
* words = ["a", "banana", "app", "appl", "ap", "apply"];
* ans = "apply";
* */

package Tries;

public class LongestWordWithAllPrefixes {

    public static String ans = "";

    public static void longestWord(Trie.Node root, StringBuilder temp) {
        if(root == null) return;

        for (int i = 0; i < 26; i++) {
            if(root.children[i] != null && root.children[i].endOfWord) {
                char ch = (char) (i+'a');
                temp.append(ch);

                if(temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); //backtrack

            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(String word : words) {
           Trie.insert(word);
        }

        longestWord(Trie.root, new StringBuilder());
        System.out.println(ans);
    }
}
