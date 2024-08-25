public class BinarySearch {

    //MY LOGIC
    public static void Binary(int num[], int key, int start, int end){

        int mid = (start+end)/2;
        if(start==end){
            if(key==num[start]){
                System.out.println("NUMBER FOUND AT INDEX "+start);
            }
            else{
                System.out.println("NUMBER NOT FOUND");
                return;
            }
        }
        if(num[mid]==key){
            System.out.println("Number Found AT INDEX "+mid);
            return;
        }
        else{
            if(key>num[mid]){
                Binary(num,key,mid+1,end);
            }
            else{
                if(key<num[mid]){
                Binary(num,key,start,mid-1);
            }
            }
        }

    }
    
    public static int binaryApnaCollege(int num[],int key, int start, int end){
        while (start<=end) {
            int mid = (start+end)/2;
            if(key==num[mid]){
                return mid;
            }
            else{
                if(key<num[mid]){
                    end = mid-1;
                }
                else if(key>num[mid]){
                    start = mid+1;
                }
            }
        }
        return-1;
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,16,18,20};
        // Binary(numbers, 20,0,numbers.length);

        int index= binaryApnaCollege(numbers, 0, 0, numbers.length);

        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Number found at Index: "+index);
        }
    }
}