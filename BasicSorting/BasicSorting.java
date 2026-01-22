package BasicSorting;

class BasicSorting {
    

    public static void  bubbleSort(int[] arr) {
        for (int turn=0;turn<arr.length-1;turn++) {
            int swap = 0;
            for(int j=0;j<arr.length-1-turn;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
    }

    public static void selectionSort(int[] arr){
        //outerloop for turns
        for(int i=0; i<arr.length-1; i++){
            int minPosition = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPosition]>arr[j]){
                    minPosition=j;
                }
            }
            //Swap
            int temp = arr[minPosition];
            arr[minPosition]=arr[i];
            arr[i]=temp;
        }
    }

     public static void insertionSort(int[] arr){
        for(int i=1 ;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            //finding correct position to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }


    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int value : arr) {
            largest = Math.max(largest, value);
        }

        int[] count = new int[largest+1 ];
        for (int k : arr) {
            count[k]++;
        }

        //sorting
        int j =0;
        for(int i=0;i<count.length;i++){
            while (count[i] > 0) {
                arr[j]=i;
                j++;
                count[i]--;                
            }
        }
    }

     public static void printArr(int[] arr){
         for (int i : arr) {
             System.out.print(i + " ");

         }
     }

    
    public static void main(String[] args) {
        int[] arr = {6,4,9,2,3,8,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        printArr(arr);
    }
}