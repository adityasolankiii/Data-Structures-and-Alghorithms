package CollectionFrameworks.Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    private static void maxArea(int[] arr){

        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        // Next Smaller Right
        Stack<Integer> nsrStack = new Stack<>();
        for (int i = arr.length - 1; i >=0 ; i--) {
            while (!nsrStack.isEmpty() && arr[nsrStack.peek()] >= arr[i]){
                nsrStack.pop();
            }

            if(nsrStack.isEmpty()){
                nsr[i] = arr.length;
            } else {
                nsr[i] = nsrStack.peek();
            }

            nsrStack.push(i);
        }

        // Next Smaller Left
        Stack<Integer> nslStack = new Stack<>();
        for (int j = 0; j < arr.length; j++) {
            while (!nslStack.isEmpty() && arr[nslStack.peek()] >= arr[j]){
                nslStack.pop();
            }

            if(nslStack.isEmpty()){
                nsl[j] = -1;
            } else {
                nsl[j] = nslStack.peek();
            }

            nslStack.push(j);
        }

        //Current Area
        for (int k= 0; k < nsl.length; k++) {
            int height = arr[k];
            int width = nsr[k] - nsl[k] - 1;
            int currArea = height * width;

            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println(maxArea);
    }
    

    public static void main(String[] args){
        int[] arr = {2,1,5,6,2,3};
        int[] arr1 = {2,3};
        maxArea(arr);
        maxArea(arr1);
    }
}
