package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int[] value = {120,100,60};
        int[] weight = {30,20,10};

        int w = 50;

        double[][] ratio = new double[value.length][2];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble((double[] a)->a[1]).reversed());

        int capacity  = w;
        double finalVal = 0;

        for (int i = 0; i < ratio.length; i++) {
            int idx =(int) ratio[i][0];

            if(capacity >= weight[idx]){ //include full item
                finalVal+=value[idx];
                capacity-=weight[idx];
            } else { //include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final Value: "+finalVal);
    }

}
