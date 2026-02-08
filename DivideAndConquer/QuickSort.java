package DivideAndConquer;

public class QuickSort {

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr, int si, int ei) {
        //base case
        if(si<=ei){
            return;
        }
        //recursion
        int partitionIdx = partition(arr, si, ei);
        quickSort(arr, si, partitionIdx+1);
        quickSort(arr, partitionIdx+1, ei);
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for (int j=si; j<ei; j++){
            if(arr[j]<=pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //change pivot
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

}