package GreedyAlgorithms;
import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {3,1,5,0,8,5};
        int[] end = {4,2,7,6,9,8};

        //sorting arrays on bases of end time if arrays are unsorted
        int[][] activities = new int[end.length][3];
        for (int i = 0; i < end.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparing(a -> a[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(0);

        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            //check overlap
            if(start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(maxAct);
    }
}
