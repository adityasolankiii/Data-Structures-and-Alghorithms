/* Diagonal sum in Matrice
   [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]] - Answer 64
   - Primary Diagonal Sum = 1 + 6 + 11 + 16 = 34
   - Secondary Diagonal Sum = 4 + 7 + 10 + 13 = 34
   - Total Sum = 64

   [[1,2,3],[4,5,6],[7,8,9]] - Answer 25
   - Primary Diagonal Sum = 1 + 5 + 9 = 15
   - Secondary Diagonal Sum = 3 + 5 + 7 = 15
   - Total Sum = 30
   - but answer will be 25 because 5 is overlapped element in both diagonals.
 */

package MD_Array;

public class Matrices{

    public static int diagonalSum(int[][] matrix){
        int n = matrix.length; // Rows
        int m = matrix[0].length; // Columns

        int primary_diagonal_sum = 0;
        int secondary_diagonal_sum = 0;

        if(n != m){
            return -1;
        }

        for(int i = 0; i < n; i++){
            primary_diagonal_sum += matrix[i][i];

            //row + col = n-1 ->  row = n-1-col;
            if(i != n-1-i)
                secondary_diagonal_sum += matrix[i][n-1-i];
        }

        return primary_diagonal_sum + secondary_diagonal_sum;
    }

    public static void main(String[] args) {
//        int[][] matrix3 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] matrix3 = {
                {2, 5, 1},
                {4, 8, 6},
                {9, 3, 7}
        };

       int[][] matrix4 = {
               {1,2,3,4},
               {5,6,7,8},
               {9,10,11,12},
               {13,14,15,16}
       };

        int[][] matrix5 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int[][] matrix6 = {
                { 1,  2,  3,  4,  5,  6},
                { 7,  8,  9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };

        int[][] matrix7 = {
                { 1,  2,  3,  4,  5,  6,  7},
                { 8,  9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40, 41, 42},
                {43, 44, 45, 46, 47, 48, 49}
        };


        System.out.println("Diagonal Sum is: " + diagonalSum(matrix3));
        System.out.println("Diagonal Sum is: " + diagonalSum(matrix4));
        System.out.println("Diagonal Sum is: " + diagonalSum(matrix5));
        System.out.println("Diagonal Sum is: " + diagonalSum(matrix6));
        System.out.println("Diagonal Sum is: " + diagonalSum(matrix7));
    }
}