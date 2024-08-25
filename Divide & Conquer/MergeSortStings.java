public class MergeSortStings {

    public static void mergeSort(String[] s, int si,int ei){
        if(si>=ei) return;
        else{
            int mid= si+ (ei-si)/2;
            mergeSort(s, si, mid);
            mergeSort(s, mid+1, ei);
            sort(s, si, ei, mid);
        }
    }

    public static void sort(String[] s, int si, int ei, int mid){
        if(si==ei) return;

        int l=si;
        int r=mid;
        int k =0;
        String[] temp = new String[ei-si+1];

        while (l<=mid && r<=ei) {
            if(s[l].compareTo(s[r])==0 || s[l].compareTo(s[r])<0){
                temp[k] =s[l];
                l++;
            }
            else{
                temp[k]=s[r];
                r++;
            }
            k++;
        }

        while (l<mid) {
            temp[k] =s[l++];
        }

        while (r<=ei) {
            temp[k]=s[r++];
        }

        for(int i=0, j=si; i<temp.length; i++, j++){
            s[j]=temp[i];
        }
    }


    public static void main(String[] args) {
        String[] s={"sun", "earth", "mars", "mercury"};
        for(int i=0;i<s.length; i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
        mergeSort(s, 0, s.length-1);

        for(int i=0;i<s.length; i++){
            System.out.print(s[i]+" ");
        }
    }
}
