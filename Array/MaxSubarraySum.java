package Array;

public class MaxSubarraySum {
    /***
     *This method will return maximum sub array sum
     * @param arr Integer Array
     */
    public static void maxSum(int[] arr){
        int MAX_SUM = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int CURR_SUM = 0;
                for (int k = i; k <= j; k++) {
                    CURR_SUM+=arr[k];
                }

                if(MAX_SUM < CURR_SUM) MAX_SUM = CURR_SUM;

            }
        }
        System.out.println("Maximum sum of SubArray is "+MAX_SUM);
    }

    /***
     * Prefix Array Method <br>
     * This method will return the maximum sum of sub-array <br>
     * @param arr Integer Array
     */
    public static void prefixSum(int[] arr){
        int MAX_SUM = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int CURR_SUM = 0;
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end  = j;
                CURR_SUM = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
            }

            if (CURR_SUM>MAX_SUM) MAX_SUM = CURR_SUM;
        }
        System.out.println("Maximum sum of SubArray is "+MAX_SUM);

    }

    public static void kadane(int[] arr){
        int MAX_SUM  = Integer.MIN_VALUE;
        int CURR_SUM = 0;
        int MAX_NEGATIVE_VALUE = Integer.MIN_VALUE;

        for (int el : arr) {
            CURR_SUM += el;
            if (CURR_SUM < 0){
                CURR_SUM = 0;
                MAX_NEGATIVE_VALUE = Math.max(el, MAX_NEGATIVE_VALUE);
            }
            MAX_SUM = Math.max(CURR_SUM, MAX_SUM);
        }

        // if all elements are negative than MAX_SUM will be 0(Zero)
        if(MAX_SUM==0) MAX_SUM = MAX_NEGATIVE_VALUE;
        System.out.println("Maximum sum of SubArray is "+MAX_SUM);
    }

    public static void main(String[] args) {
        int[] arr = {3,-5,-1,-6,-8};
//        maxSum(arr);
//        prefixSum(arr);
        kadane(arr);
    }
}
