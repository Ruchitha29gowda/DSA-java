public class ArrayReversed {

    public static void reverse(int num[]){
        int start=0;
        int end = num.length -1;

        while (start<=end) {
            if(start==end){
                return;
            }

            int t =num[start];
            num[start]=num[end];
            num[end]=t;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5};
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        reverse(num);

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }

    }
}
