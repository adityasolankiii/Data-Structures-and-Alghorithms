package DivideAndConquer;

/***
 * for rotated sorted array
 */
public class ModifiedBinarySearch {

    public static int search(int[] arr, int si, int ei, int target){
        //base case
        if(si>ei){
            return -1;
        }
        //recursion
        int mid = si + (ei - si)/2;

        //case mid
        if (arr[mid] == target){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a: left
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, si, mid-1, target);
            } else {
                //case b: right
                return search(arr, mid+1, ei, target);
            }
        }

        //mid on L2
        else {
            //case a : right
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, mid+1, ei, target);
            } else {
                return search(arr, si, mid-1, target);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,0,1,2,3};
        int target = 0;
        int tgtIdx = search(arr, 0, arr.length-1, target);
        System.out.println(tgtIdx);
    }
}
