package CollectionFrameworks.LinkedList;

public class SearchRecursive extends LinkedList{
    /***
     * Searches for the specified key in the LinkedList using recursion.
     * @param key the element to be searched in the list.
     * @return the index of the key if found, otherwise -1
     */
    public int recSearch(int key){
        return helper(head, key);
    }

    int helper(Node head, int key){
        //base case
        if(head == null){
            return -1;
        }

        //recursion
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public static void main(String[] args) {
        SearchRecursive ll = new SearchRecursive();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        System.out.println(ll.recSearch(3));

    }
}
