package CollectionFrameworks.Stack;

import java.util.Stack;

public class DuplicateParentheses {

    /***
     * This method will check for if following String contains duplicate parentheses or not
     * @param str String
     * @return true if string contains extra or duplicate parentheses
     */
    private static boolean isDuplicate(String str){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(stack.pop() != '('){
                    count++;
                }

                if(count<1){
                    return true;
                }

            } else {
                //opening
                stack.push(ch);
            }
        }

        return false;

    }

    public static void main(String[] args){
        String str = "(a+b)";
        String str1 = "((a+b))+(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
