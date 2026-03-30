package Heaps;

/***
 * Steps for Heap sort
 * 1) Heapify for non-leaf nodes
 * 2) push largest at end
 *  - Swap
 *  - heapify
 * 3)
 */
public class Sorting {

    private static void heapify(int idx, int size, int[] arr) {
        int left = 2*idx+1;
        int right = 2*idx+2;
        int maxIdx = idx;

        if(left<size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if(right<size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != idx) {
            //swap
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[idx];
            arr[idx] = temp;

            heapify(maxIdx, size, arr);
        }
    }

    public static void heapSort(int[] arr) {
        // step1- build maxHeap
        int n = arr.length;
        for (int i = n/2; i >= 0; i--) {
            heapify(i, n, arr);
        }

        //step2 - push largest at end
        for (int i = n-1; i >= 0; i--) {
            //swap (largest-first with last)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0, i, arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};

        heapSort(arr);

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
