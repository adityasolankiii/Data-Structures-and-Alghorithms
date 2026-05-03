package Tries;

public class TrieImplementation {
    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee"};

        for(String word : words) {
            Trie.insert(word);
        }

        System.out.println(Trie.search("thee"));
        System.out.println(Trie.search("thor"));
    }
}
