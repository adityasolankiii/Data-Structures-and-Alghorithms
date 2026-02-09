package CollectionFrameworks.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainerWithMostWater {
    private static int storeWater(ArrayList<Integer> list) {
        int maxWater = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int height = Math.min(list.get(i),list.get(j));
                int width = j-i;
                int currWater = height * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println("Maximum Water level: " + storeWater(list));

    }

}
