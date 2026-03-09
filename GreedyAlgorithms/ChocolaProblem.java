/*
We are given a bar of chocolate composed of mxn square pieces.
One should break the chocolate into single squares.
Each break of a part of the chocolate is charged a cost expressed by a positive integer.
This cost does not depend on the size of the part that is being broken but only depends on the line the break goes along.
Let us denote the costs of breaking along consecutive vertical lines with x1, x2, .... xm-1 and
along horizontal lines with y1, y2, ... yn-1 Compute the minimal cost of breaking the whole chocolate into single squares.
*/

package GreedyAlgorithms;
import java.util.Arrays;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n=4, m=6;

        Integer[] costVer = {2,1,3,1,4};
        Integer[] costHor = {4,1,2};

        Arrays.sort(costVer, (a,b)->b-a);
        Arrays.sort(costHor, (a,b)->b-a);

        int verPiece = 1 , horPiece = 1;
        int v = 0, h = 0;
        int totalCost = 0;

        while(v<costVer.length && h<costHor.length) {
            if(costVer[v] > costHor[h]) {
                totalCost += horPiece*costVer[v];
                verPiece++;
                v++;
            } else {
                totalCost += verPiece*costHor[h];
                horPiece++;
                h++;
            }
        }

        while(v<costVer.length) {
            totalCost += horPiece*costVer[v];
            verPiece++;
            v++;
        }

        while(h<costHor.length) {
            totalCost += verPiece*costHor[h];
            horPiece++;
            h++;
        }

        System.out.println(totalCost);
    }
}
