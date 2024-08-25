public class SearchInRotated {
    public static int search(int[] arr, int target){
        int i=0;
        while(arr[i+1]>arr[i] && i<arr.length){
            i++;
        }
        System.out.println(arr[i]);


        if(target<=arr[i]&&target>arr[0]){
            int si =0;
            int ei =i;
            while(si<ei){
                int mid= si + (ei-si)/2;
                if(arr[mid] ==target){
                    System.out.println("Index : "+mid);
                    return mid;
                }
                if(target<arr[mid]) ei = mid-1;
                else si = mid+1;
            }
            return -1;
        }
        else{
            int si=i+1;
            int ei=arr.length-1;
            while(si<ei){
                int mid= si + (ei-si)/2;
                if(arr[mid] ==target){
                    System.out.println("Index : "+mid);
                    return mid;
                }
                if(target<arr[mid]) ei = mid-1;
                else si = mid+1;
            }
        }
        System.out.println("Final statement: "+-1);
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        search(arr, 10);
    }
}
