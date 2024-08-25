public class LargestNumber {

    public static int largestNum(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;

        for(int i=0; i<number.length;i++){
            if(number[i]>largest){
                largest=number[i];
            }
            if(number[i]<smallest){
                smallest=number[i];
            }
        }
        System.out.println("SMALLEST : "+smallest);
        System.out.println("LARGEST: "+largest);
        return largest;
    }
    public static void main(String[] args) {

        int num[]={10,20,0,500,1,5,60,3,5,7};
        largestNum(num);
        
    }
}
