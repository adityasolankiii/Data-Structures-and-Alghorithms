package Array;

class TrappingRainWater{
    
    public static int trappedRainWater(int[] height) {

    int n = height.length;
    //Calculate left max boundary -- Auxiliary Array (helper array)
    int[] leftMax = new int[n];
    leftMax[0] = height[0];

    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(height[i],leftMax[i-1]);
    }

    //Calculate right max boundary -- Auxiliary Array (helper array)
    int[] rightMax = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i = n-2; i >= 0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int trappedWater = 0;
    //loop
    for(int i = 0; i < n; i++){
        //waterLevel = min(leftMax Boundary, rightMax Boundary)
        int waterLevel = Math.min(leftMax[i], rightMax[i]);

        //trapped water = waterLevel - height[i]
        trappedWater += waterLevel - height[i];
    }
    

    return trappedWater;
    }

    public static void main(String[] args) {
        int[] height ={1,5,3,4,9,3,5,7,6};
        System.out.print(trappedRainWater(height));
    }
}