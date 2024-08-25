public class HeapSort {
    
    public static void heapSort(int[] nums){
        //build min Heap
        int n=nums.length;
        for(int i=n/2; i>=0; i--){
            heapify(nums, i, n);
        }

        //swap the max with the last element and then fix it
        System.out.println("\n");

        for(int i =n-1; i>=0; i--){
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;

            heapify(nums, 0, i);
        }

        System.out.println("\n\n");
        printNums(nums);

        
    }

    public static void heapify(int[] nums, int i, int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIndx = i;

        if(left<n && nums[left]>nums[maxIndx]){
            maxIndx = left;
        }

        if(right<n && nums[right]>nums[maxIndx]){
            maxIndx = right;
        }

        if(maxIndx!=i){
            int temp = nums[maxIndx];
            nums[maxIndx] = nums[i];
            nums[i]= temp;

            heapify(nums, maxIndx, n);
        }

        printNums(nums);
        System.out.println();

        
    }


    public static void heapifyDescending(int[] nums, int i, int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIndx = i;

        if(left<n && nums[left]<nums[maxIndx]){
            maxIndx = left;
        }

        if(right<n && nums[right]<nums[maxIndx]){
            maxIndx = right;
        }

        if(maxIndx!=i){
            int temp = nums[maxIndx];
            nums[maxIndx] = nums[i];
            nums[i]= temp;

            heapify(nums, maxIndx, n);
        }

        printNums(nums);
        System.out.println();

        
    }

    public static void printNums(int[] nums){
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i]+"  ");
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,4,5,3};
        System.out.print("Array: ");
        printNums(nums);

        System.out.println();
        heapSort(nums);
    }
}
