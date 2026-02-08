package DivideAndConquer;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,9,10,23,35,56,78,1,3,5,6};
        int target = 5;
        int resultIndex = BinarySearch.search(arr,0,arr.length-1,target);

        if (resultIndex != -1) {
            System.out.println(target + " was found at index " + resultIndex);
        } else {
            System.out.println(target + " was not found in the array.");
        }

    }

    private static int search(int[] arr, int si, int ei, int target) {
        //base case
        if(si>=ei){
            return -1;
        }

        //recursion
        int mid = si + (ei-si)/2;
        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
           return search(arr, si, mid, target);
        } else {
           return search(arr, mid+1, ei, target);
        }
    }
}