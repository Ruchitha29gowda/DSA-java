public class Max_SubArray {

    public static void maxSub(int arr[]){
        int max= Integer.MIN_VALUE;
        int subarr[]= new int[5];

        for(int i=0; i<=arr.length-1; i++){
            for(int j=i; j<=arr.length-1; j++){
                int sum=0;
                System.out.print("[ ");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print("]");
                System.out.print("   ");
                if(max<sum){
                    max=sum;
                    for(int k=i; k<=j; k++){
                        subarr[k]=arr[k];
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Max of Sub Array: "+max);
        System.out.println("MAX SubArray");
        for(int i=0; i<=subarr.length-1; i++){
            System.out.print(subarr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int arr[]= {2,4,6,-8,-10};
        maxSub(arr);
    }
}
