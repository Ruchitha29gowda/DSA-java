public class Assignment {

    //****************** QUESTION 1 ***********************

    public static boolean checkRepeatedElements(int nums[]){
        for(int i=0; i<=nums.length-1; i++){
            for(int j=i+1; j<=nums.length-1; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }

        return false;
    }

    //****************** QUESTION 2 ***********************
    public static void searchInrotatedArray(int nums[], int target){
        //find the index of the smallest element
        //eg: [7,8,9,0,1,2,3,4,5,6];
        //the sorted array is rotated at index 4... hence we're finding the index of the smallest element
        int min = minSearch(nums);
        System.out.println(min);

        //check where to find the element
        //to the left or to the right of min

        if(target<nums[min] || target > nums[min-1]){
            System.out.println("NOT FOUND");
            return;
        }
        else{
            if(target>=nums[min]&& target<nums[nums.length-1]){
                //search in right of min element
                System.out.println("search in right");
                int res = search(nums, min, nums.length-1, target);
                System.out.println("FOUND AT "+res);
            }
            else{
                //search in left of min element
                System.out.println("search in left");
                int res = search(nums, 0, min, target);
                System.out.println("FOUND AT "+res);
            }
        }

    }

    public static int minSearch(int nums[]){
        int l=0, r=nums.length-1;
        while(l<r){
            int mid= l+ (r-l)/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return mid;
            }
            else if(nums[mid]<=nums[l] && nums[mid]<=nums[r]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
        return l;
    }

    public static int search(int nums[], int left, int right, int target){
        while(left<=right){
            int mid= left+ (right-left)/2;
            if(nums[mid]==target){
                System.out.println("FOUND!");
                return mid;
            }
            else{
                if(target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }

    
    //****************** QUESTION 3 ***********************
    
    public static void findMAxProfit(int prices[]){
        int maxProfit =0;
        int sp=0; 
        int bp=0;

        bp = prices[0];
        for(int i=1; i<=prices.length-1; i++){
            sp= prices[i];
            if(bp<sp){
                int profit = sp-bp;
                System.out.print("SP: "+sp+" BP: "+bp);
                System.out.println(" profit: "+profit);
                maxProfit= Math.max(maxProfit, profit);
            }
            else{
                bp=sp;
            }
        }

        System.out.println(maxProfit);
    }

    //****************** QUESTION 4 ***********************

    public static void trappedWater(int heights[]){
        int n=heights.length;
        int waterTrapped=0;
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];

        leftMax[0]=heights[0];
        for(int i=1; i<=n-1; i++){
            leftMax[i]=Math.max(leftMax[i-1],heights[i]);
        }

        rightMax[n-1]=heights[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(rightMax[i+1], heights[i]);
        }

        //print both arrays
        for(int i=0; i<=n-1; i++){
            System.out.print(leftMax[i]+" ");
        }
        System.out.println();
        for(int i=0; i<=n-1; i++){
            System.out.print(rightMax[i]+" ");
        }

        for(int i=0; i<=n-1; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += waterLevel-heights[i];
        }
        System.out.println("\n");
        System.out.println(waterTrapped);
    }

    
    //****************** QUESTION 5 ***********************

    public static void calculateTriplets(int nums[]){
        for(int i=0; i<=nums.length-1; i++){
            for(int j=i+1; j<=nums.length-1; j++){
                for(int k=j+1; k<=nums.length-1; k++){
                    if(nums[i]+ nums[j]+nums[k] ==0){
                        System.out.print("["+nums[i]+" , "+nums[j]+" , "+nums[k]+"] , ");
                    }
                }
            }
            
        }
    }

    public static void main(String[] args) {
        // int nums[]={1,2,3,4};
        // System.out.println(checkRepeatedElements(nums));

        // int nums2[]={7,8,9,0,1,2,5,6};
        // searchInrotatedArray(nums2, 8);

        // int prices[]={7,6,4,3,1};
        // findMAxProfit(prices);

        // int heights[]={0,1,0,2,1,0,1,3};
        // trappedWater(heights);

        int nums[] = {-1,0,1,2,-1,-4};
        calculateTriplets(nums);
    }
}
