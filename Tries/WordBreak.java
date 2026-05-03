package Tries;

public class WordBreak {

    public static boolean wordCount(String key) {
        //base case - key.length() == 0
        if(key.isEmpty()) {
            return true;
        }

        //recursion
        for(int i=1; i<=key.length(); i++) {
            if(Trie.search(key.substring(0,i)) && wordCount(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam","samsung", "mobile", "ice"};

        for (String word : words) {
            Trie.insert(word);
        }

        String key = "ilikesamsung";

        System.out.println(wordCount(key));
    }
}
