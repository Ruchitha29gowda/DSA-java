public class InversionCountRecursion {

    public static int inversion(int nums[], int si, int ei){
        int invcount=0;
        if(si<ei){
            int mid= si+ (ei-si)/2;
            invcount=inversion(nums, si, mid);
            invcount+=inversion(nums, mid+1, ei);
            invcount+=mergeCount(nums, si, ei, mid);
        }

        return invcount;
    }

    public static int mergeCount(int nums[], int si, int ei, int mid){
        int count=0;
        int i = si;
        int j=mid+1;
        int temp[]=new int[ei-si+1];
        int k=0;

        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
                count+=(mid+1-i);//because j started from mid+1...hence mid+1-i;
            }
        }
        while (i<=mid) {
            temp[k++]=nums[i++];
        }

        while (j<=ei) {
            temp[k++]=nums[j++];
        }

        for(int m=0,n=si; m<temp.length; m++,n++){
            nums[n]=temp[m];
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={2,3,4,1,6,7};
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println(inversion(nums, 0, nums.length-1));
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
