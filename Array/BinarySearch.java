package Array;

public class BinarySearch {

    public static void search(int[] arr, int key){
        int start = 0;
        int end = arr.length;
        int index = -1;

        while(start<=end){
            int mid = (start + end) / 2;

            if(key == arr[mid]){
                index = mid;
                break;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if(index == -1){
            System.out.println("Not Found!");
        } else {
            System.out.println("Found at index : "+ index);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,6,7,9,10,23,35,56,78};

        BinarySearch.search(arr,35);
    }
}
