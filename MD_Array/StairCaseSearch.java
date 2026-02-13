package MD_Array;

public class StairCaseSearch {
    public static void search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                System.out.println("(" + row + ", " + col + ")");
                return;
            }
            else if (target < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }

        System.out.println("Not found");;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4,  5,  6},
                { 7,  8,  9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };
        search(matrix, 255);
    }
}
