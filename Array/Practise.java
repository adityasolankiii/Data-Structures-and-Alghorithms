
class Practise{

    public static int trappedRainWater(int arr[]){
        int n = arr.length;

        //calculating leftMax Boundry
        int leftMax[] = new int[n];
        
        leftMax[0]=arr[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }


        //Calcutaing rightMax Boundry
        int rightMax[] = new int[n];
        rightMax[n-1]=arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }


        //Calculating trap water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i],leftMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {1,5,3,4,9,3,50,7,6};
        System.out.println(trappedRainWater(height));
    }
}