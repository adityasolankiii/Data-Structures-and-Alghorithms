package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimumAbsoluteDifferencePairs {
    public void findMinAbsDiffPairs(int[] A, int[] B) {
        int[][] helperA = new int[A.length][2];

        for (int i = 0; i < helperA.length; i++) {
            helperA[i][0] = i;
            helperA[i][1] = A[i];
        }
        Arrays.sort(helperA, Comparator.comparingInt(a->a[1]));

        int[][] helperB = new int[B.length][2];
        for (int i = 0; i < helperB.length; i++) {
            helperB[i][0] = i;
            helperB[i][1] = B[i];
        }
        Arrays.sort(helperB, Comparator.comparingInt(b->b[1]));

        int minAbsDiffSum = 0;
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < helperA.length; i++) {
            int currDiff = helperA[i][1] - helperB[i][1];
            minAbsDiffSum+=Math.abs(currDiff);
//            pairs.add(Arrays.asList(helperA[i][0], helperB[i][0]));
            pairs.add(List.of(helperA[i][0], helperB[i][0]));
        }

        System.out.println("Minimum absolute value pair sum: "+minAbsDiffSum);

        System.out.println("Pairs (index of A, index of B): " + pairs);

    }

    public static void main(String[] args) {
//        int[] A = {4,1,8,7};
//        int[] B = {2,3,6,5};
        int[] A = {1,2,3};
        int[] B = {2,1,3};

        MinimumAbsoluteDifferencePairs obj = new MinimumAbsoluteDifferencePairs();
        obj.findMinAbsDiffPairs(A,B);
    }
}
