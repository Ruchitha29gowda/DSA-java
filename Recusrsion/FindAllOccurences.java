public class FindAllOccurences {

    public static String FindIndx(int[] arr,String ans , int n,int key){
        if(n == arr.length){
            System.out.println(ans);
            return ans;
        }
        else{
            if(arr[n]==key){
                FindIndx(arr, ans+n+" ", n+1, key);
            }
            else{
                FindIndx(arr, ans, n+1, key);
            }

            return ans;
        }
    }



    public static void main(String[] args) {
        int arr[]= {3,2,4,5,6,2,7,2,2};

        FindIndx(arr, "", 0, 2);
        

    }
}
