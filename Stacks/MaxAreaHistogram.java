import java.util.Stack;

public class MaxAreaHistogram {
    public static int findMaxArea(int[] arr){
        if(arr.length==0)return 0;
        if(arr.length==1) return arr[0];

        else{
            printArr(arr);
            System.out.println();
            int area=0;
            for(int i=0; i<arr.length; i++){
                int curr = arr[i];
                int width=0;

                for(int j=i-1; j>=0; j--){
                    if(curr<=arr[j]) width++;
                }
                System.out.print("curr: "+curr+" Left: "+width+" ");

                for(int j=i; j<arr.length; j++){
                    if(curr<=arr[j]) width++;
                }
                System.out.println("right :"+width);

                area= Math.max(area, width*curr);
            }

            return area;
        }
    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
    }



    public static int findMaxAreaStacks(int[] arr){
        if(arr.length==0)return 0;
        if(arr.length==1) return arr[0];

        // int[] arr = {2,1,5,6,2,3};

        //find next smaller from left
        int[] nxtSmallerLeft = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<nxtSmallerLeft.length; i++){
            int curr = arr[i];
            while (!st.isEmpty() && arr[st.peek()]>curr) {
                st.pop();
            }
            if(st.isEmpty()){
                nxtSmallerLeft[i]=-1;
            }
            else{
                nxtSmallerLeft[i]=st.peek();
            }
            st.add(i);
        }
        while(!st.isEmpty()) st.pop();

        //find the smaller from right
        // int[] arr = {2,1,5,6,2,3};
        int[] nxtSmallerRight = new int[arr.length];
        for(int i=nxtSmallerRight.length-1; i>=0; i--){
            int curr = arr[i];
            while(!st.isEmpty() && curr<arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nxtSmallerRight[i]=arr.length;
            }
            else{
                nxtSmallerRight[i]=st.peek();
            }

            st.add(i);
        }

        printArr(nxtSmallerLeft);
        System.out.println();
        printArr(nxtSmallerRight);

        int area=0;
        for(int i=0; i<arr.length; i++){
            int l=nxtSmallerLeft[i];
            int r=nxtSmallerRight[i];
            area= Math.max(area,(r-l-1)*arr[i]);
        }

        System.out.println("\nMax area : "+area);
        return area;


    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int[] arr2 = {2,0,2};
        // System.out.println(findMaxArea(arr2));

        findMaxAreaStacks(arr2);

    }
}
