package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndianCoins {
    private static void findCoins(int[] coins, int value) {
        List<Integer> result = new ArrayList<>();

        int i = coins.length-1;
        while(i>=0) {
            if(value >= coins[i]) {
                result.add(coins[i]);
                value-=coins[i];
            } else {
                i--;
            }
        }

        /*for (int j = coins.length-1; j>=0; j--) {
            if(coins[j] <= value) {
                while (coins[j] <= value){
                    result.add(coins[j]);
                    value-=coins[j];
                }
            }
        }*/

        System.out.println(result);
        System.out.println(result.size());
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,500,2000};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        int value = sc.nextInt();
        findCoins(coins, value);
    }

}
