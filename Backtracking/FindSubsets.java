package Backtracking;

public class FindSubsets {

    public static void find(String str, String ans, int index){
        //Base case
        if(index == str.length()){
            if(ans.isEmpty()){
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Recursion
        // Yes case
        find(str, ans+str.charAt(index), index+1);

        // No case
        find(str, ans, index+1);
    }

    public static void main(String[] args) {
        String str = "ABC";
        find(str,"", 0);
    }
}
