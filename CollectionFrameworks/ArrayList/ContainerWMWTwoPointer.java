package CollectionFrameworks.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWMWTwoPointer {
    public static int fsw(ArrayList<Integer> list){
        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        int maxWater = Integer.MIN_VALUE;

        while(leftPointer < rightPointer){
            int height = Math.min(list.get(leftPointer),list.get(rightPointer));
            int width = rightPointer - leftPointer;
            int currWater = height * width;
            maxWater = Math.max(maxWater, currWater);

            if(list.get(leftPointer) < list.get(rightPointer)){
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println("Maximum Water level: " + fsw(list));
    }
}
