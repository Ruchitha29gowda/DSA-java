public class ArraysBacktracking{
    public static void rec(int[] n, int index,int val){
        if(index>=n.length){
            prnt(n);
            System.out.println();
            return; 
        }
        n[index]=val;
        rec(n, index+1,val+1);
        n[index]=n[index]-2;
    }

    public static void prnt(int[]n){
        for(int i=0; i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Arrays");
        int[] n= new int[5];
        rec(n, 0,1);
        prnt(n);
    }
}