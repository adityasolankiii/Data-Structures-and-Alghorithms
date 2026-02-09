package CollectionFrameworks.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSum {
    public static boolean findPair(ArrayList<Integer> list, int targetSum){

        int n = list.size();

        int rightPointer = 0;
        int leftPointer = 0;

        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                rightPointer = i;
                leftPointer = i+1;
                break;
            }
        }

        while(leftPointer != rightPointer){
            int currSum = list.get(leftPointer) + list.get(rightPointer);

            if(currSum == targetSum){
                System.out.printf("Index: [%d, %d]", rightPointer, leftPointer);
                return true;
            } else if(currSum > targetSum) {
                rightPointer = (rightPointer+n-1) % n; //Update Right Pointer Using Modulo [RightPointer = (RightPointer+n-1)n]
            } else {
                leftPointer = (leftPointer+1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,1,2,3));
        if(!findPair(list, 5)){
            System.out.println("Not Found!");
        }
    }
}
