public class Assignment {

    public static void printArray (int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        
        System.out.println();
    }

    //bubble sort
    public static void bubble(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    int t= nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
    }

    //selection sort
    public static void selection(int nums[]){

        for(int i=0; i<nums.length; i++){

            int largest= nums[i];
            int index=0;
            for(int j=i; j<nums.length; j++){
                if(largest<=nums[j]){
                    largest = Math.max(largest, nums[j]);
                    index=j;
                }
            }
            
            int t=nums[i];
            nums[i]=nums[index];
            nums[index]= t;
        }
        System.out.println();
    }


    public static void insertion(int nums[]){
        for(int i=1; i<nums.length-1; i++){
            int curr=nums[i];
            int prev = curr-1;

            while(prev>=0 && curr>=nums[prev]){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;

        }

        // for(int i=1; i<nums.length-1; i++){
        //     int curr = nums[i];
        //     int prev = i-1;

        //     while(prev>=0 && nums[prev]>curr){
        //         nums[prev+1]= nums[prev];
        //         prev--;
        //     }

        //     nums[prev+1]=curr;
        // }
    }


    
    public static void main(String[] args) {
        // int nums[]= {3,6,2,1,8,7,4,5,3,1};
        int nums[]={2,3,5,1,4};
        System.out.println("Original array: ");
        printArray(nums);


        //bubble sort
        // bubble(nums);
        // System.out.println("Bubble sort array: ");

        //selection sort
        // selection(nums);
        // System.out.println("selection sort array: ");

        insertion(nums);
        System.out.println("insertion sort array: ");


        printArray(nums);
    }
}
