package Array;

public class SubArrays {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = i; k <=j ; k++) {
                    sb.append(arr[k]);
                    if(k<j) sb.append(",");
                }
                System.out.println(sb);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,6,8};
        SubArrays.print(arr);
    }
}
