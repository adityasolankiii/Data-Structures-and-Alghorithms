package CollectionFrameworks.Stack;

import java.util.Stack;

public class NextGreaterElement {

    private static void nextGreater(int[] arr, int[] nga){
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nga[i] = -1;
            } else {
                nga[i] = arr[stack.peek()];
            }

            stack.push(i);
        }
    }

    public static void main(String[] args){
        int[] arr = {6,8,0,1,3};
        int[] nextGreaterArr = new int[arr.length];

        nextGreater(arr, nextGreaterArr);

        for(int el : nextGreaterArr){
            System.out.println(el);
        }

    }
}
