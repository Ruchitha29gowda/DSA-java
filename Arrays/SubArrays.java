public class SubArrays {

    public static void printSubArrays(int num[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int count =0;
        for(int i=0; i<=num.length-1; i++){
            for(int j=i; j<=num.length-1; j++){
                int subSum=0;
                System.out.print("[ ");
                for(int k=i; k<=j; k++){
                    System.out.print(num[k]+" ");
                    subSum+=num[k];
                }
                System.out.print(" ]");
                System.out.println("\nSubArray: "+subSum+"\n");
                if(max<subSum){
                    max=subSum;
                }
                if(min>subSum){
                    min=subSum;
                }
                count++;
            }
            System.out.println("\n");
        }
        System.out.println("Total pairs: "+count);
        System.out.println("MAX of sum of SubArrays: "+max);
        System.out.println("MIN of sum of SubArrays: "+min);

    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printSubArrays(num);
    }
}
