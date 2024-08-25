public class PrefixSum {

    public static void prefixSum(int arr[]){
        int prefixArr[]= new int[arr.length];
        int max = Integer.MIN_VALUE;
        int sum=0;

        prefixArr[0]= arr[0];
        for(int i=1; i<=arr.length-1; i++){
            for(int j=i; j<=arr.length-1; j++){
                prefixArr[i]= prefixArr[i-1]+arr[i];
            }
        }

        for(int i=0; i<=arr.length-1; i++){
            int start=i;
            for(int j=i; j<=arr.length-1; j++){
                int end = j;

                if(start==0){
                    sum=prefixArr[end];
                }
                else{
                    sum= prefixArr[end]-prefixArr[start-1];
                }

                if(max<sum){
                    max=sum;
                }
            }
        }

        for(int i=0; i<=arr.length-1; i++){
            System.out.print(prefixArr[i]+" ");
        }
        System.out.println();
        System.out.println("MAX : "+max);

        
    }


    public static void kadanesAlgo(int arr[]){
        int currentSum =0; 
        int max= Integer.MIN_VALUE;

        for(int i =0; i<=arr.length-1; i++){
            currentSum+=arr[i];
            if(currentSum<=0){
                currentSum=0;
            }
            else{
                max = Math.max(max,currentSum);
            }
        }

        System.out.println(max);
    }


    public static void main(String[] args) {
        int arr[]= {1, -2, 6 ,-1 ,3};
        int arr2[]={-2,-3,4,-1,-2,1,5,-3};
        prefixSum(arr);
        // kadanesAlgo(arr);
        kadanesAlgo(arr);
    }
}
