package Backtracking;

public class Backtrack {
    public static void changeArr(int[] arr, int index, int value){
        //base case
        if(index==arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[index] = value;
        changeArr(arr, index+1, value+1); //function call step
        arr[index] = arr[index] - 2; //backtracking step
    }

    public static void printArr(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}
