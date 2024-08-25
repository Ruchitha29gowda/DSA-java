public class QuickSort {

    public static void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        else{
            int p = partition(arr, si, ei);
            quickSort(arr, si, p-1);
            quickSort(arr, p+1, ei);
            
        }

    }

    public static int partition(int[] arr, int si, int ei){
        int i = si-1;
        int pivot = arr[ei];
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                int temp = arr[++i];
                arr[i]= arr[j];
                arr[j]=temp;

            }
        }

        int temp = pivot;
        arr[ei]=arr[++i];
        arr[i]=temp;
        return i;
    }



    public static void main(String[] args) {
        System.out.println("Quick Sort");
        int arr[] = {5,3,2,4,1,8,7,6,9,10};
        quickSort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
