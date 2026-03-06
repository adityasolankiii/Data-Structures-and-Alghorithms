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
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1; i < activities.length; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum Activities = " + maxAct);
        System.out.println("Activities Selected = " + ans);
    }
}
