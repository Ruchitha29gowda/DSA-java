public class GrigWays {
    public static int gridWays(int x, int y, int n, int m){

        if(x==n-1 && y==m-1) return 1;
        else{
            if(x<n && y<m){
                return gridWays( x+1, y, n, m)+ gridWays(x, y+1, n, m);
            }
            else return 0;
        }

    }

    public static void main(String[] args) {
        int n=4;
        int m=4;
        System.out.println(gridWays(0, 0, n, m));

    }
}
