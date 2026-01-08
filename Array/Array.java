class Array{

    public static int highestSum(int num[]){
        int ms = Integer.MIN_VALUE;
        for (int i =0 ; i < num.length; i++) {
            for(int j=i;j<num.length;j++){
                int cs=0;
                for(int k=i;k<=j;k++){
                    cs = cs + num[k];
                }                
                ms = Math.max(cs,ms);
            }
        }
        return ms;
    }

    public static void kadanes(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            } ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[]={-2,-7,-8,-4,-10,-5};
        System.out.println("Highest Product is : "+highestSum(arr));
        kadanes(arr);
    }
}