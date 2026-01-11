package Array;

public class PairsInArray {

    public static void pairs(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9,10,23,35,56,78};
        PairsInArray.pairs(arr);
    }
}
