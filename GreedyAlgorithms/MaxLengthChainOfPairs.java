package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxLengthChainOfPairs {

    public static void main(String[] args) {
        int[][] pairs = {{39,60}, {50,90},{5,28}, {5,24}, {27,40}};

        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));

        List<List<Integer>> chain = new ArrayList<>();

        int lastIdx = pairs[0][1];
        chain.add(List.of(pairs[0][0], pairs[0][1]));

        for(int i = 1; i < pairs.length; i++) {

            if(pairs[i][0] > lastIdx) {
                chain.add(List.of(pairs[i][0], pairs[i][1]));
                lastIdx = pairs[i][1];
            }

        }

        System.out.println(chain);
        System.out.println(chain.size());
    }

}
