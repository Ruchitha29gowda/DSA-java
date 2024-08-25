public class TrappingRainWater {

    public static void calculateTrappedWater(int height[]){
        int n= height.length;
        int trappedWater = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0]=height[0];
        for(int i=1; i<=n-1; i++){
            leftMax[i]= Math.max(leftMax[i-1], height[i]);
        }

        rightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0;i--){
            rightMax[i]= Math.max(rightMax[i+1], height[i]);
        }

        for(int i=0; i<=n-1; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]);
        }

        System.out.println(trappedWater);
    }


    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        calculateTrappedWater(height);

    }
}
