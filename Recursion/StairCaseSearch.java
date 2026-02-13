package Recursion;

public class StairCaseSearch {
    /***
     * This method has O(n+m) time complexity
     * @param matrix 2D Array
     * @param sRow starting row
     * @param sCol starting col
     * @param target target value/key
     * @return boolean
     */
    public static boolean search(int[][] matrix, int sRow, int sCol, int target){
        if(sRow>=matrix.length || sCol<0){
            return false;
        }

        //base case
        if(matrix[sRow][sCol] == target){
            System.out.println("(" + sRow + ", " + sCol + ")");
            return true;
        }

        //recursion
        if(target < matrix[sRow][sCol]){
            return search(matrix, sRow, sCol-1, target);
        } else {
            return search(matrix, sRow+1, sCol, target);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4,  5,  6},
                { 7,  8,  9, 10, 11, 12},
        };
        int target = 12;
        search(matrix, 0, matrix[0].length-1, target);
    }
}
